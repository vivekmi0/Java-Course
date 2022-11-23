package MethodsInjava;
import java.util.*;
public class FirstDigit {
    public static int printFirstDigit(int n){
        while(n>10){
            n = n/10;
        
        }
        return n;

    }
    public static void main(String[] args) {
        System.out.println("Enter The Five Number Digit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 9768;
        System.out.println(printFirstDigit(n));
    }
    
}
