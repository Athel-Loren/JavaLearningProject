package md.tekwillacademy.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int score = 80;

        if (score >=90){
            System.out.println("The Grade is A");
        } else if (score >= 80){
            System.out.println("The Grade is B");
        } else if (score >= 70) {
            System.out.println("The Grade is C");
        } else if (score >= 60) {
            System.out.println("The Grade is D");
        } else {
            System.out.println("The exam is failed");


        }
    }
}
