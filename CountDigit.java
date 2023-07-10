import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Count = 0;
        while (n > 0) {
            Count++;
            n /= 10;
        }
        System.out.println(Count);

        sc.close();
    }
}
