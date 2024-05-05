package ru.beldmian;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.util.Random;
import java.util.stream.DoubleStream;

@BenchmarkOptions(callgc = false, benchmarkRounds = 20, warmupRounds = 3)
public class MainBenchmarkTest {
    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();
    double[] smallArray;
    double[] bigArray;
    double[] hugeArray;

    @Before
    public void prepare() {
        smallArray = DoubleStream.generate(() -> new Random().nextDouble(100)).limit(10000).toArray();
        bigArray = DoubleStream.generate(() -> new Random().nextDouble(100)).limit(100000).toArray();
        hugeArray = DoubleStream.generate(() -> new Random().nextDouble(100)).limit(1000000).toArray();
    }

    @Test
    public void benchmarkMinSmall() {
        Main._min(smallArray);
    }
    @Test
    public void benchmarkMinBig() {
        Main._min(bigArray);
    }
    @Test
    public void benchmarkMinHuge() {
        Main._min(hugeArray);
    }
}
