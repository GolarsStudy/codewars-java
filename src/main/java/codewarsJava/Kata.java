// https://www.codewars.com/kata/find-the-unique-number-1/train/java

package codewarsJava;

import java.util.Arrays;

public class Kata {

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return (arr[0] != arr[1]) ? arr[0] : arr[arr.length - 1];
    }
}
