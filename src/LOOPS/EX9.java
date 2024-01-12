package LOOPS;

import java.util.Scanner;
public class EX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("enter N ");
        N = scanner.nextInt();
        int s = 0;
        while (N > 0) {
            s += N % 10; //ABC
            N /= 10; //AB
        }
        System.out.println("s= " + s);
    }
}
