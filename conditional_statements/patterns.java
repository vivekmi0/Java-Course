package conditional_statements;

public class patterns {
    public static void main(String[] args) {
        int row = 4;
        // int col = 5;
        // outer loop
        // for(int i = 1;i<=row;i++) {
        //     // inner loop
        //     for (int j = 1; j<= col;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i=1;i<=row;i++){

        //     for(int j=1;j<=col;j++){
        //       if(i==1 || j==1 || i==row || j==col ){
        //        System.out.print("*");
        //       }else{
        //         System.out.print(" ");
        //       }
        //     }
        //     System.out.println();
        // }
        // for (int i=1;i<=row;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i=row;i>=1;i--){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i=1;i<=row;i++){

            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
        }
    }
}
