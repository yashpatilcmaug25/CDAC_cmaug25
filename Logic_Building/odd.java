import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }
        System.out.println("The sum of odd numbers from 1 to " + N + " is: " + sum);
    }
}
