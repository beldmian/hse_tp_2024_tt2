package ru.beldmian;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void test_min() {
        assertEquals(12., Main._min(new double[] {12, 128, 256}));
        assertEquals(0., Main._min(new double[] {0, 1, 0, 2, 1, 3, 0}));
    }

    public void test_max() {
        assertEquals(256., Main._max(new double[] {12, 128, 256}));
        assertEquals(3., Main._max(new double[] {0, 1, 0, 2, 1, 3, 0}));
    }

    public void test_sum() {
        assertEquals(396., Main._sum(new double[] {12, 128, 256}));
        assertEquals(7., Main._sum(new double[] {0, 1, 0, 2, 1, 3, 0}));
    }

    public void test_mult() {
        assertEquals(393216., Main._mult(new double[] {12, 128, 256}));
        assertEquals(0., Main._mult(new double[] {0, 1, 0, 2, 1, 3, 0}));
    }
}