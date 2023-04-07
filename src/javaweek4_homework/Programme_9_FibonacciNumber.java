package javaweek4_homework;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {
    public static void isFibonacci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1 + " " + n2);
        //loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.println("" + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
