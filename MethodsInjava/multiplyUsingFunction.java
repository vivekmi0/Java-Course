package MethodsInjava;

public class multiplyUsingFunction {
    public static int multiplyTwoNumbers(int a ,int b){
       return a*b;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int result = multiplyTwoNumbers(a ,b);
        System.out.println(result);
    }
    
}
