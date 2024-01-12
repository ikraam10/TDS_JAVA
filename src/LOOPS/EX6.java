package LOOPS;

import java.util.Scanner;
public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<=9;i++) {
            for(int j =1; j<=9;j++) {
                for (int k =1; k<=9;k++) {
                    if(i+j+k==15) {
                        System.out.println(i+"+"+j+"+"+k+"= 15");
                    }
                }
            }
        }
    }
}

