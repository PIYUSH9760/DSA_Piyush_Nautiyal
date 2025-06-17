/*   This program is to vheck if the Kth bit from right is Set or Un-set and then checked from left .
this program takean an input number with the Kth position . Assuming it is a 32 bit integer . */


import java.util.Scanner;

public class KthBitChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("Enter the bit position to check ");
        int k = sc.nextInt();

        // Checking bits
        checkKthBitFromMSB(n, k);
        checkKthBitFromLSB(n, k);

        sc.close();
    }

    
    public static void checkKthBitFromMSB(int n, int k) {         // For MSB .
        int totalBits = 32;

        if((1 & ( n >> (totalBits - k))) == 0)
    {
        
    System.out.println("bit is unset"+ " " + (1 & ( n >> (totalBits - k))) ); 

    }
    else {
        
    System.out.println("bit is set" + " " + (1 & ( n >> (totalBits - k)))); 
    }

    }

   
    public static void checkKthBitFromLSB(int n, int k) {            // For LSB .

        if ((n & (1 << (k - 1))) != 0) 
        {
            System.out.println("From LSB: Bit is set");
        } 
        else {
                System.out.println("From LSB: Bit is not set");
             }
    }

}
