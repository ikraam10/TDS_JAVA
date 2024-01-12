package LOOPS;

import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {

        int n , result = 0, un1=1, un2=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("The N:");
        n = scanner.nextInt();
        if (n==0 || n==1) {
            System.out.println(1);
            return;
        }
        System.out.print("1 1 ");
        for (int i = 2; i <= n; i++) {
            result = un1 + un2;
            un2=un1;
            un1 = result;
            System.out.print(result+ " ");

        }


    }
}
