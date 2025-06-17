import java.util.Scanner;

public class Check_For_Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        if((n & (n-1)) == 0){
            System.out.println(n+" is Power of 2");
        }else{
            System.out.println(n+" is not Power of 2");
        } 
        sc.close();
    }
}