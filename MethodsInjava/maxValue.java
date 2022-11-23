package MethodsInjava;

public class maxValue {
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(getMax(a, b));
    }
}
