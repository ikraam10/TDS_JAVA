package LOOPS;

import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int s=0, f=1;
        System.out.println("enter N ");
        N = scanner.nextInt();
        for(int i =1; i<=N; i++) {
            f*=i;
            if (i % 2 != 0)
                s += i;
        }
        System.out.println("f = "+f+ ", s= "+s);


    }
}
