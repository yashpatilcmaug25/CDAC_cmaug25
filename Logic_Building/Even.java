import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
        }
    }
}
