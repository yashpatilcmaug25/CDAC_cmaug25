public class UninitializedVariables {
    public static void main(String[] args) {
        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0L;
        float e = 0.0f;
        double f = 0.0;
        char g = '\u0000'; 
        boolean h = false;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: [" + g + "]");
        System.out.println("boolean: " + h);
    }
}

//output:
/*D:\Logicbuilding\Day2>java UninitializedVariables
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0
char: []
boolean: false
*/


