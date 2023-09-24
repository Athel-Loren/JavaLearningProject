package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a=a+1;
        System.out.println(a); // a = 11;

        b = b % a;
        // b%=a;
        System.out.println(b); // b = 4;

        a%=b;
        // a = a%b; a = 11 %4;
        System.out.println(a); // a =3

        a +=4;

        //Calculate the Sum of The Numbers till the X;

        int x = 5;
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum += i; // sum = sum+i;
        }

        System.out.println(sum);

        int c = 45;
        double d = 5;

        c/=d;
        d/=c;

        System.out.println(c);
        System.out.println(d);
        double result = d/c;
        System.out.println(result);
    }
}
