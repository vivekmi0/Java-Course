package conditional_statements;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  age = sc.nextInt();
        if (age > 17 ){
            System.out.println("Adult");
        }else {
            System.out.println("Not Adult");
        }
    }
    
}
