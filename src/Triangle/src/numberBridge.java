import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i=1; i<=2*n-1; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<=n; i++){
            int count = 1;
            for (int j=1; j<=n-i; j++){
                System.out.print(j + " ");
                count++;
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print(" " + " ");
                count++;

            }
            for (int j=1; j<=n-i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();

        }
    }
}
