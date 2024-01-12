package LOOPS;

import java.util.Scanner;
public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n = scanner.nextInt();
        for(int i =1; i<=n; i++) {
            for(int j=1 ;j<=i;j++)
                System.out.print(i);
            System.out.println(" ");
        }
    }
}

