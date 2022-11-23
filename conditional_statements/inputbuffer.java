import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class inputbuffer {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println(" "+ x);

    }
}
