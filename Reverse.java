import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = (n % 10);
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("The Number is Reverse :" + rev);
        sc.close();
    }
}