package com.github.sisyphsu.nakedata.convertor.codec.lang;

import com.github.sisyphsu.nakedata.convertor.Converter;
import com.github.sisyphsu.nakedata.convertor.Codec;

/**
 * Long's codec
 *
 * @author sulin
 * @since 2019-05-13 18:13:32
 */
public class LongCodec extends Codec {

    /**
     * Convert String to Long
     *
     * @param s String
     * @return Long
     */
    @Converter
    public Long toLong(String s) {
        if (s == null)
            return null;
        return Long.parseLong(s);
    }

    /**
     * Convert Long to String
     *
     * @param l Long
     * @return String
     */
    @Converter
    public String toString(Long l) {
        return l == null ? null : l.toString();
    }

    /**
     * Convert Long[] to long[]
     *
     * @param arr long[]
     * @return Long[]
     */
    @Converter
    public Long[] convert(long[] arr) {
        if (arr == null) {
            return null;
        }
        Long[] result = new Long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    /**
     * Convert Long[] to long[]
     *
     * @param arr Long[]
     * @return long[]
     */
    @Converter
    public long[] convert(Long[] arr) {
        if (arr == null) {
            return null;
        }
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

}
