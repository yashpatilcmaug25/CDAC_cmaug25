import java.util.Scanner;

class Sum {

    void sumOfTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c = a + b; // sum
        System.out.println("The sum of " + a + " and " + b + " is " + c);
    }
}

class B {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sumOfTwoNumbers();
    }
}
/* output :
D:\Logicbuilding\Day3>java B
Enter the first number: 15
Enter the second number: 25
The sum of 15 and 25 is 40
*/

