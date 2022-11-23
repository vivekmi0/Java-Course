package MethodsInjava;
import java.util.*;

public class methods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // String name = "My Name Is Vivek";
        printMyName(name);
    }
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
}
