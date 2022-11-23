package MethodsInjava;
import java.util.*;

import javax.sound.midi.Soundbank;
public class add {
    public static int addArguments(int n){
        return n*2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // addArguments(n);
        System.out.println(addArguments(n));
        // addArguments(a, b);
        
    }
}
