public class GradeEvaluation {
    public static void main(String[] args) {
        // Predefined marks
        int maths = 80;
        int science = 85;
        int history = 90;

        
        double average = (maths + science + history) / 3.0;

     
        System.out.println("Average Marks: " + average);

      
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 70 && average <= 89) {
            System.out.println("Grade: B");
        } else if (average >= 50 && average <= 69) {
            System.out.println("Grade: C");
        } else if (average >= 30 && average <= 49) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }
}
//output :
//D:\Logicbuilding\Day2>java GradeEvaluation
//Average Marks: 85.0
//Grade: B