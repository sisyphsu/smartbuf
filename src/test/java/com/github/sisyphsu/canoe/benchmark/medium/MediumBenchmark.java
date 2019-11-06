package com.github.sisyphsu.canoe.benchmark.medium;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.sisyphsu.canoe.CanoePacket;
import com.github.sisyphsu.canoe.CanoeStream;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Benchmark                 Mode  Cnt     Score     Error  Units
 * MediumBenchmark.json      avgt    6  4139.153 ± 269.692  ns/op
 * MediumBenchmark.packet    avgt    6  4921.997 ±  65.037  ns/op
 * MediumBenchmark.protobuf  avgt    6   801.130 ±  11.859  ns/op
 * MediumBenchmark.stream    avgt    6  4104.508 ± 130.964  ns/op
 *
 * @author sulin
 * @since 2019-10-31 20:40:55
 */
@Warmup(iterations = 2, time = 2)
@Fork(2)
@Measurement(iterations = 3, time = 3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class MediumBenchmark {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final UserModel    USER   = UserModel.random();
    private static final CanoeStream  STREAM = new CanoeStream();

    @Benchmark
    public void json() throws Exception {
        MAPPER.writeValueAsBytes(USER);
    }

    @Benchmark
    public void protobuf() {
        USER.toUser().toBuilder();
    }

    @Benchmark
    public void packet() throws Exception {
        CanoePacket.serialize(USER);
    }

    @Benchmark
    public void stream() throws Exception {
        STREAM.serialize(USER);
    }

}