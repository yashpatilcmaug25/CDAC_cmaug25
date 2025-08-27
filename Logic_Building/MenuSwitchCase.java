import java.util.Scanner;

public class MenuSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Grade Evaluation System
                    int maths = 80;
                    int science = 85;
                    int history = 90;
                    double avg = (maths + science + history) / 3.0;
                    System.out.println("Average Marks: " + avg);

                    if (avg >= 90) {
                        System.out.println("Grade: A");
                    } else if (avg >= 70) {
                        System.out.println("Grade: B");
                    } else if (avg >= 50) {
                        System.out.println("Grade: C");
                    } else if (avg >= 30) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Fail");
                    }
                    break;

              case 2: // Leap Year Check
      int year1 = 2024;
      int year2 = 1900;

    if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
        System.out.println(year1 + " is a leap year.");
    } else {
        System.out.println(year1 + " is not a leap year.");
    }

    if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) {
        System.out.println(year2 + " is a leap year.");
    } else {
        System.out.println(year2 + " is not a leap year.");
    }
    break;


                case 3: // Day of the Week
                    System.out.print("Enter a number (1-7): ");
                    int day = sc.nextInt();
                    switch (day) {
                        case 1: System.out.println("Sunday"); break;
                        case 2: System.out.println("Monday"); break;
                        case 3: System.out.println("Tuesday"); break;
                        case 4: System.out.println("Wednesday"); break;
                        case 5: System.out.println("Thursday"); break;
                        case 6: System.out.println("Friday"); break;
                        case 7: System.out.println("Saturday"); break;
                        default: System.out.println("Invalid day number!");
                    }
                    break;

                case 4: 
                    class Temp {
                        byte a;
                        short b;
                        int c;
                        long d;
                        float e;
                        double f;
                        char g;
                        boolean h;
                    }
                    Temp t = new Temp();
                    System.out.println("byte: " + t.a);
                    System.out.println("short: " + t.b);
                    System.out.println("int: " + t.c);
                    System.out.println("long: " + t.d);
                    System.out.println("float: " + t.e);
                    System.out.println("double: " + t.f);
                    System.out.println("char: [" + t.g + "]");
                    System.out.println("boolean: " + t.h);
                    break;

                case 5: // Exit
                    System.out.println("Exiting program. ");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
/*
D:\Logicbuilding\Day3>java MenuSwitchCase

--- Menu ---
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 1
Average Marks: 85.0
Grade: B

--- Menu ---
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 2
2024 is a leap year.
1900 is not a leap year.

--- Menu ---
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 3
Enter a number (1-7): 3
Tuesday

--- Menu ---
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 4
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0
char: []
boolean: false

--- Menu ---
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 5
Exiting program.

/*
