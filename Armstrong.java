import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            int count = 0;
            int temp = num;

            while (temp != 0) {
                count++;
                temp /= 10;
            }

            int sum = 0;
            temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
