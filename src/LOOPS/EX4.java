package LOOPS;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=60 , b=5, p=1;
        for(int i=1; i<=Math.min(a,b); i++) {
            if(a%i==0&&b%i==0) {
                p =i;
            }
        }
        System.out.println("p= "+p);

    }
}

