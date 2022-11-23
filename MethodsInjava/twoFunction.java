package MethodsInjava;
import java.util.*;
public class twoFunction {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
         int a = 4;
         int b = 5;
        int sum = calculateSum(a, b);
        System.out.println(sum);

        
    }
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
}   }
