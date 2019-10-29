package com.github.sisyphsu.canoe.transport;

import com.github.sisyphsu.canoe.node.std.ArrayNode;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static com.github.sisyphsu.canoe.transport.IOTest.enableCxt;
import static com.github.sisyphsu.canoe.transport.IOTest.transIO;

/**
 * @author sulin
 * @since 2019-10-17 14:18:59
 */
public class IOSliceTest {

    @Test
    public void testMixArray() throws IOException {
        ArrayNode node = create();
        List<Object> data = new ArrayList<>();
        for (int i = 0, len = node.size(); i < len; i++) {
            data.addAll((Collection<?>) node.slices()[i].data());
        }
        Object[] srcArr = data.toArray();

        // execute in temporary mode
        enableCxt = false;
        Object tgt = transIO(node);
        assert Objects.deepEquals(srcArr, tgt);

        // execute in context/stream mode
        enableCxt = true;
        tgt = transIO(node);
        assert Objects.deepEquals(srcArr, tgt);
    }

    @Test
    public void test2DArray() throws IOException {
        List<ArrayNode> arrs = new ArrayList<>();
        arrs.add(ArrayNode.valueOf(RandomUtils.nextBytes(1024)));
        arrs.add(ArrayNode.valueOf(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE}));
        arrs.add(ArrayNode.valueOf(new long[]{0, Long.MIN_VALUE, Long.MAX_VALUE}));
        arrs.add(ArrayNode.valueOf(new double[]{0, Double.MIN_VALUE, Double.MAX_VALUE}));

        ArrayNode node = new ArrayNode();
        node.addArraySlice(arrs);

        Object[] srcArr = new Object[arrs.size()];
        int off = 0;
        for (ArrayNode arr : arrs) {
            srcArr[off++] = arr.slices()[0].data();
        }
        Object tgt;
        // execute in temporary mode
        enableCxt = false;
        tgt = transIO(node);
        assert Objects.deepEquals(srcArr, tgt);

        // execute in context/stream mode
        enableCxt = true;
        tgt = transIO(node);
        assert Objects.deepEquals(srcArr, tgt);
    }

    ArrayNode create() {
        int len;
        ArrayNode node = new ArrayNode();
        // boolean
        len = RandomUtils.nextInt(100, 200);
        List<Boolean> booleans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            boolean b = RandomUtils.nextBoolean();
            booleans.add(b);
        }
        node.addBooleanSlice(booleans);

        // byte
        len = RandomUtils.nextInt(100, 200);
        List<Byte> bytes = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            byte tmp = (byte) RandomUtils.nextInt();
            bytes.add(tmp);
        }
        node.addByteSlice(bytes);

        // short
        len = RandomUtils.nextInt(100, 200);
        List<Short> shorts = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            short tmp = (short) RandomUtils.nextInt();
            shorts.add(tmp);
        }
        node.addShortSlice(shorts);

        // int
        len = RandomUtils.nextInt(100, 200);
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int tmp = RandomUtils.nextInt();
            ints.add(tmp);
        }
        node.addIntSlice(ints);

        // long
        len = RandomUtils.nextInt(100, 200);
        List<Long> longs = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            long tmp = RandomUtils.nextLong();
            longs.add(tmp);
        }
        node.addLongSlice(longs);

        // null
        len = RandomUtils.nextInt(100, 200);
        List<?> nulls = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            nulls.add(null);
        }
        node.addNullSlice(nulls);

        // float
        len = RandomUtils.nextInt(100, 200);
        List<Float> floats = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            float tmp = RandomUtils.nextFloat();
            floats.add(tmp);
        }
        node.addFloatSlice(floats);

        // double
        len = RandomUtils.nextInt(100, 200);
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            double tmp = RandomUtils.nextDouble();
            doubles.add(tmp);
        }
        node.addDoubleSlice(doubles);

        // String
        len = RandomUtils.nextInt(100, 200);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            String tmp = RandomStringUtils.random(16);
            strings.add(tmp);
        }
        node.addStringSlice(strings);

        // symbol
        len = RandomUtils.nextInt(100, 200);
        List<String> symbols = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            String tmp = RandomStringUtils.randomAlphabetic(16);
            symbols.add(tmp);
        }
        node.addSymbolSlice(symbols);

        return node;
    }

}