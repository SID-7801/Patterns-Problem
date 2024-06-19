import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int m = sc.nextInt();
        for (int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.out.print(j);
//                System.out.print(i); try this also its different
//                System.out.print((j+64)); try this also it's different

            }
            System.out.println();
        }
    }
}
