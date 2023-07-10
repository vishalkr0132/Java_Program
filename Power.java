import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base Number :");
        int a = sc.nextInt();
        System.out.println("Enter The Power Value :");
        int b = sc.nextInt();
        int pow = 1;
        for (int i = 1; i < b; i++) {
            pow *= a;
        }
        System.out.println("The Number of Power :" + pow);
        sc.close();
    }

}
