package LOOPS;

import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 20;
        int max = Integer.MIN_VALUE;
        int p=0, i=1;
        do{
            System.out.println("enter N ");
            N = scanner.nextInt();
            if(N>max) {
                max = N;
                p = i;
            }
            i++;
        } while(N!= 0);
        System.out.println("max =  "+max+", p= "+p);

    }
}
