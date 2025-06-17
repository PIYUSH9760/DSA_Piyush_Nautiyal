package rest;


import java.util.Scanner;

public class Sum_of_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements from 1 to " + (n + 1) + " with one number missing:");
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        int expectedSum = (n + 1) * (n + 2) / 2;
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);

        sc.close();
    }
}
