package MethodsInjava;
import java.rmi.StubNotFoundException;
import java.util.*;

public class method {
    public static void main(String[] args) {
        System.out.println("Main Begns");
        fun1();
        System.out.println("Main Ends");
        
    }
    public static void fun1(){
        System.out.println("fun () Begins");
        fun2();
        System.out.println("fun1 () ends");
    }
    public static void fun2(){
        System.out.println("Inside fun2()");

    }
}