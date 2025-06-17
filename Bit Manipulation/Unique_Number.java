package rest;

import java.util.*;

class Unique_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements where every number appears twice except one");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int unique = findUnique(arr);
        System.out.println("The unique number is: " + unique);

        sc.close();
    }

    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; 
        }
        return result;
    }
}
