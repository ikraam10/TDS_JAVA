package TABLES;


import java.util.Scanner;
import java.util.ArrayList;
public class EX3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of students n: ");
        int n = scanner.nextInt();
        System.out.println("enter the threshold average s: ");
        double s = scanner.nextDouble();
        double[] m = new double[n];
        System.out.println("enter the average of students m: ");
        for(int i =0; i<n;i++) {
            System.out.println("student"+(i+1)+": ");
            m[i]=scanner.nextDouble();
        }
        int count = 0;
        for(int i =0; i<n;i++) {
            if(m[i]>=s)
                count++;
        }
        System.out.println("number of student with average >= "+s+": "+count);
    }

}
