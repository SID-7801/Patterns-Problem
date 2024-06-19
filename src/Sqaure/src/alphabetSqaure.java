import java.util.Scanner;

public class alphabetSqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int m = sc.nextInt();
        for (int i=1;i<=m;i++){
            for (int j=1;j<=m;j++){
                System.out.print((char) (j+64)+ " ");
//                System.out.print((char) (i+64)+ " "); try this its different
            }
            System.out.println();
        }
    }
}
