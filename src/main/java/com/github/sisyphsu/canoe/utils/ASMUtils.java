package com.github.sisyphsu.canoe.utils;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ASMUtils wraps some useful function for bytecode operation
 *
 * @author sulin
 * @since 2019-10-31 14:29:16
 */
public final class ASMUtils {

    private static final ASMByteArrayClassLoader INSTANCE = new ASMByteArrayClassLoader();

    private ASMUtils() {
    }

    /**
     * Add push byte/short/int instruction into stack
     *
     * @param mv The MethodVisitor used to add instruction
     * @param i  The number to add
     */
    public static void addIntInstruction(MethodVisitor mv, int i) {
        switch (i) {
            case 0:
                mv.visitInsn(Opcodes.ICONST_0);
                break;
            case 1:
                mv.visitInsn(Opcodes.ICONST_1);
                break;
            case 2:
                mv.visitInsn(Opcodes.ICONST_2);
                break;
            case 3:
                mv.visitInsn(Opcodes.ICONST_3);
                break;
            case 4:
                mv.visitInsn(Opcodes.ICONST_4);
                break;
            case 5:
                mv.visitInsn(Opcodes.ICONST_5);
                break;
            default:
                if (i < 128) {
                    mv.visitIntInsn(Opcodes.BIPUSH, i);
                } else if (i < Short.MAX_VALUE) {
                    mv.visitIntInsn(Opcodes.SIPUSH, i);
                } else {
                    mv.visitLdcInsn(i);
                }
        }
    }

    /**
     * Add a box instruction into {@link MethodVisitor} by the specified primary class
     *
     * @param mv MethodVistor to add box instruction
     * @param ps The primary class
     */
    public static void addBoxInstruction(MethodVisitor mv, Class<?> ps) {
        if (ps == boolean.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
        } else if (ps == byte.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
        } else if (ps == short.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
        } else if (ps == int.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
        } else if (ps == long.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
        } else if (ps == float.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
        } else if (ps == double.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
        } else if (ps == char.class) {
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
        } else {
            throw new IllegalArgumentException("[ps] must be primary type: " + ps);
        }
    }

    /**
     * Add an unbox instruction into {@link MethodVisitor} by the specified primary class
     *
     * @param mv MethodVisitor to add unbox instruction
     * @param ps The primary class
     */
    public static void addUnboxInstruction(MethodVisitor mv, Class<?> ps) {
        if (ps == boolean.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
        } else if (ps == byte.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Byte", "byteValue", "()B", false);
        } else if (ps == short.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Short", "shortValue", "()S", false);
        } else if (ps == int.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
        } else if (ps == long.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
        } else if (ps == float.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Float", "floatValue", "()F", false);
        } else if (ps == double.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Double", "doubleValue", "()D", false);
        } else if (ps == char.class) {
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Character", "charValue", "()C", false);
        } else {
            throw new IllegalArgumentException("[ps] must be primary type: " + ps);
        }
    }

    /**
     * Load named class from the specified {@link ClassWriter}
     *
     * @param writer  The specified ClassWriter instance
     * @param clsName class's name
     * @return Class instance
     */
    public static Class<?> loadClass(ClassWriter writer, String clsName) {
        return INSTANCE.loadClass(clsName, writer.toByteArray());
    }

    // find the specified field from cls, includes superclass
    public static Field findField(Class cls, String name, Class type) {
        if (cls == Object.class) {
            return null;
        }
        Field field = null;
        try {
            field = cls.getDeclaredField(name);
        } catch (NoSuchFieldException ignored) {
        }
        if (field != null && field.getType() == type) {
            return field;
        } else {
            return findField(cls.getSuperclass(), name, type);
        }
    }

    public static List<Field> getAllValidFields(Class<?> cls) {
        if (cls == Object.class) {
            return Collections.emptyList();
        }
        List<Field> fields = new ArrayList<>();
        for (Field f : cls.getDeclaredFields()) {
            int mod = f.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isTransient(mod) || f.isAnnotationPresent(Deprecated.class)) {
                continue; // ignore non-public and transient and deprecated
            }
            if (f.getType() == Void.class) {
                continue;
            }
            fields.add(f);
        }
        fields.addAll(getAllValidFields(cls.getSuperclass()));
        return fields;
    }

    /**
     * Helps load byte[] as class
     */
    static final class ASMByteArrayClassLoader extends ClassLoader {

        ASMByteArrayClassLoader() {
            super(ASMByteArrayClassLoader.class.getClassLoader());
        }

        public synchronized Class<?> loadClass(String name, byte[] code) {
            return INSTANCE.defineClass(name, code, 0, code.length);
        }
    }

}
