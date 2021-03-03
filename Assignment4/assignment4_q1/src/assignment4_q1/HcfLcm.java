package assignment4_q1;
import java.util.*;
public class HcfLcm {
    public static void main(String args[]) {
        int choice, num1, num2, hcf, lcm;
        Scanner sc = new Scanner(System.in);
        
        //asking from the user what he want to calculate HCF or LCM ;
        System.out.println("enter your choice:\n 1:LCM \n 2:HCF");
        choice = sc.nextInt();
        
        //asking the user to input two numbers 
        System.out.println("enter numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        //calling the function to calculate HCF of the given two numbers ;
        hcf = gcd(num1, num2);
        
        //here we are calculating LCM from HCF as we know that LCM =num1*num2/HCF ;
        lcm = num1 * num2 / hcf;
        
        //printing HCF or LCM as per the choice input given by the user ;
        if (choice == 2) {
            System.out.println("HCF: " + hcf);
        } else {
            System.out.println("LCM: " + lcm);
        }
    }
    
    //function to calculate HCF of the given numbers ;
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);

    }

}