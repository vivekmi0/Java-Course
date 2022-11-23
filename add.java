import java.util.Scanner;
public class add {
    public static void main (String[] args){
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First no. ");
        x = sc.nextInt();
        System.out.println("Second no. ");
        y = sc.nextInt();
        sc.close();
        sum = x + y;
        System.out.println("Sum of no. "+sum);
    }
}
