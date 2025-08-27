import java.util.Scanner;

public class PositiveNumber {

    void askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        } while (number <= 0);

        System.out.println("You entered a positive number: " + number);
    }

    public static void main(String[] args) {
        PositiveNumber obj = new PositiveNumber();
        obj.askForPositiveNumber();
    }
}
/*
D:\Logicbuilding\Day3>java PositiveNumber.java
Enter a positive number: -5
Enter a positive number: 0
Enter a positive number: 8
You entered a positive number: 8
*/