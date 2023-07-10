import java.util.Scanner;

public class SumEvenSumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int count = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter element " + i + ": ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        sc.close();
    }
}
