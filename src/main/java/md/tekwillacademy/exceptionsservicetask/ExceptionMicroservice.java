package md.tekwillacademy.exceptionsservicetask;

public class ExceptionMicroservice {
    public static void main(String[] args) {
        String controlVariable = null;
        System.out.println("The String Length it is =" + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The String Length it is =" + TextManager.getTheTextLength("Dionis"));
        System.out.println("The String Length it is =" + TextManager.getTheTextLengthWithIf(controlVariable));

        System.out.println(ArithmeticOperationService.divideWithoutExceptionHanding(0, 3));
        System.out.println(ArithmeticOperationService.divideWithExceptionHandling(0, 0));

        System.out.println("The show must go on");

    }
}
