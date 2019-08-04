package com.github.sisyphsu.nakedata.convertor.codec;

import com.github.sisyphsu.nakedata.convertor.CodecFactory;
import com.github.sisyphsu.nakedata.convertor.reflect.XTypeUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author sulin
 * @since 2019-08-04 17:46:15
 */
public class LangCodecTest {

    private LangCodec codec = new LangCodec();

    @Before
    public void setUp() {
        codec.setFactory(CodecFactory.Instance);
    }

    @Test
    public void test() throws Exception {
        String pattern = "yyyy-MM-dd hh:mm:ss.SSS";
        assert Objects.equals(pattern, codec.toString(codec.toSimpleDateFormat(pattern)));

        String clzName = "java.util.List";
        assert Objects.equals(codec.toString(codec.toClass(clzName)), clzName);

        assert codec.toEnum(codec.toString(TimeUnit.SECONDS), XTypeUtils.toXType(TimeUnit.class)) == TimeUnit.SECONDS;

//        Pojo pojo = new Pojo(1000L, "hello", Collections.singleton(1.999));
//        Pojo pojo = new Pojo(1000L, "hello");
        Pojo pojo = new Pojo("hello");
        Map map = codec.toMap(pojo);
        assert map != null && map.size() == pojo.getClass().getDeclaredFields().length;
        assert Objects.equals(map.get("name"), pojo.name);
//        assert Objects.equals(map.get("id"), pojo.id);
//        assert pojo.scores.equals(map.get("scores"));

        Object obj = codec.toObject(map, XTypeUtils.toXType(Pojo.class));
        assert obj instanceof Pojo;
        assert obj.equals(pojo);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Pojo {
        // private long id; // TODO can't resolve primary data type
        private String name;
        // private Set<Double> scores; // TODO can't repass Collection
    }

}