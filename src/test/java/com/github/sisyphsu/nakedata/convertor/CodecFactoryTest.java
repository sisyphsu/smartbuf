package com.github.sisyphsu.nakedata.convertor;

import com.github.sisyphsu.nakedata.node.Node;
import org.junit.Test;

import java.util.BitSet;
import java.util.Set;

/**
 * @author sulin
 * @since 2019-08-02 14:10:30
 */
public class CodecFactoryTest {

    private static CodecFactory factory = CodecFactory.Instance;

    @Test
    public void installCodec() {
        Set<Class<? extends Codec>> codecs = CodecScanner.scanCodecs(Node.class.getPackage().getName());
        for (Class<? extends Codec> codec : codecs) {
            factory.installCodec(codec);
        }
    }

    @Test
    public void getPipeline() {
        ConverterPipeline pipeline1 = factory.getPipeline(BitSet.class, Byte[].class);
        assert pipeline1.getMethods().size() == 2;
    }

}