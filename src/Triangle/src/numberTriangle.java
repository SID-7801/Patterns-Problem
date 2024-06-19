import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n : ");
        int m = sc.nextInt();
        for (int i=1;i<=m;i++){
            if (i % 2 == 0){
                for (int j=1;j<=i;j++)
                    System.out.print((char) (j+64));
            } else {
                for (int j=1;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }





//        for (int i=1;i<=m;i++){
//            for (int j=1;j<=i;j=j+2){
////                System.out.print(i);
////                System.out.print(j);
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//        }
    }
}
