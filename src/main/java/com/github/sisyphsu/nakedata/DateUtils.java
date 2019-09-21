package com.github.sisyphsu.nakedata;

import com.github.sisyphsu.nakedata.convertor.CodecFactory;
import com.github.sisyphsu.nakedata.node.ArrayNodeCodec;
import com.github.sisyphsu.nakedata.node.BasicNodeCodec;
import com.github.sisyphsu.nakedata.node.BeanNodeCodec;

/**
 * @author sulin
 * @since 2019-09-21 13:50:31
 */
public class DateUtils {

    private static final CodecFactory CODEC_FACTORY = new CodecFactory();

    static {
        CODEC_FACTORY.installCodec(ArrayNodeCodec.class);
        CODEC_FACTORY.installCodec(BasicNodeCodec.class);
        CODEC_FACTORY.installCodec(BeanNodeCodec.class);
    }

}