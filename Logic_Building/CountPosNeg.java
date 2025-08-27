import java.util.Scanner;

public class CountPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int posCount = 0, negCount = 0;

        System.out.print("Enter 6 integers: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            }
        }

        System.out.println("Positive numbers: " + posCount);
        System.out.println("Negative numbers: " + negCount);
    }
}
