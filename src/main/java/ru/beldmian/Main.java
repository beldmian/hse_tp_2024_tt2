package ru.beldmian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static double _min(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("numbers should not be null");
        }
        OptionalDouble result = Arrays.stream(numbers).min();
        if (result.isEmpty()) {
            throw new NullPointerException("numbers should not be null");
        }
        return result.getAsDouble();
    }
    public static double _max(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("numbers should not be null");
        }
        OptionalDouble result = Arrays.stream(numbers).max();
        if (result.isEmpty()) {
            throw new NullPointerException("numbers should not be null");
        }
        return result.getAsDouble();
    }
    public static double _sum(double[] numbers) throws NullPointerException {
        if (numbers == null) {
             throw new NullPointerException("numbers should not be null");
        }
        return Arrays.stream(numbers).sum();
    }
    public static double _mult(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("numbers should not be null");
        }
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }
    public static double[] readFile(String file_path) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(file_path));
        Scanner s = new Scanner(br);
        List<Double> result = new ArrayList<Double>();
        while (s.hasNextDouble()) {
            result.add(s.nextDouble());
        }
        return result.stream().mapToDouble(n -> n).toArray();
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("File path: ");
        Scanner s = new Scanner(System.in);
        String file_path = s.next();
        double[] data = readFile(file_path);
        System.out.printf("Min: %f\n", _min(data));
        System.out.printf("Max: %f\n", _max(data));
        System.out.printf("Sum: %f\n", _sum(data));
        System.out.printf("Product: %f\n", _mult(data));
    }
}