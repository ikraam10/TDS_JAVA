package LOOPS;

import java.util.Scanner;
public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=9;
        for(int i =1; i<=9; i++) {
            for(int j=1 ;j<=i;j++)
                System.out.print("*");
            System.out.println(" ");
        }
        for(int i= 9 ;i>=1;i-- ) {
            for (int j = i; j>=1;j--)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}

