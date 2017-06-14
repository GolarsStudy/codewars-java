package codewarsJava;

import java.util.stream.IntStream;

public class NthSeries {

    public static String seriesSumShort(int n) {
        return String.format("%.2f", IntStream.range(0, n).mapToDouble(num -> 1.0 / (1 + num * 3)).sum());
    }

    public static String seriesSumBest(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

    }

    @org.jetbrains.annotations.NotNull
    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        double result = 1;
        for (int i = 1; i <= (n - 1); i++) {
            result += 1 / (i * 3 + 1.0);
        }
        return String.format("%(.2f", result);
    }
}
