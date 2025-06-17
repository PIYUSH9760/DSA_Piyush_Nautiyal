package rest;

import java.util.Scanner;

public class Power_of_2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfTwo(n)==0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is Not a power of 2.");
        }

        sc.close();
    }

    public static int isPowerOfTwo(int n) {
        return (n & (n - 1));
    }
}
