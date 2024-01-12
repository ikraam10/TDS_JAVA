package TABLES;
	import java.util.Scanner;
import java.util.ArrayList;
public class EX1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        int[] T = new int[n];
        int i;
        for(i =0; i<n;i++ ){
            System.out.print("element"+(i+1)+": ");
            T[i] = scanner.nextInt();
        }
        int max = T[0];
        int min = T[0];
        for( i =1; i<n;i++){
            max = (T[i] > max) ? T[i] : max;
            min = (T[i] < min) ? T[i] : min;}
        System.out.println("max = "+max+", min = "+min);


    }
}
