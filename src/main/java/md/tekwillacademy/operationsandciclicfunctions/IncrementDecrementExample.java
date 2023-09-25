package md.tekwillacademy.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 89;
        int b = 34;

        System.out.println(a++); //Se printeaza a, si apoi se face incrementul;
        System.out.println(a); //Aici a deja e 90;
        // System.out.println(++a); - Aici a = 91;

        System.out.println(++b); //In cazul dat mai intii se face increment si se atribuie lu b, deci b = 35;

        a=a+1;
        System.out.println(a);

        System.out.println(a--);

        System.out.println(a);

        System.out.println(--b);


        // a = 90;
        b = --a;
        System.out.println(b); // b= 89;
        System.out.println(a); // a= 89;



    }

}
