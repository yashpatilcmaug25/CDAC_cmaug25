import java.util.Scanner;

public class SumFrom1ToN {

  
    public static int calculateSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i; // add i to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int result = calculateSum(N);

      
        System.out.println("The sum of numbers from 1 to " + N + " is: " + result);

        sc.close();
    }
}
//output :
//D:\Logicbuilding\Day3>java  SumFrom1ToN
// Enter a number: 5
// The sum of numbers from 1 to 5 is: 15


