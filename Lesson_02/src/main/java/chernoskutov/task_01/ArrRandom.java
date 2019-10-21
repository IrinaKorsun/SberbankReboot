package main.java.chernoskutov.task_01;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrRandom {
    private static final int SZ = 40;
    public static void main(String[] args) {
        System.out.println("All matches:");
        Double[] arr = Stream.generate(Math::random).limit(SZ).sorted().peek(System.out::println).toArray(Double[]::new);
        System.out.println("========");
        System.out.println("min: " + Arrays.stream(arr).min(Double::compareTo).get().toString());
        System.out.println("max: " + Arrays.stream(arr).max(Double::compareTo).get().toString());
        System.out.println("avg: " + Arrays.stream(arr).reduce(Double::sum).get() / arr.length );
    }
}
