import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int m = sc.nextInt();
        for (int i=1; i<=m; i++){
            for (int j=1; j<=m-i; j++){
                System.out.print(" " + " ");
            }
            for (int j=1; j<=2*i - 1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
