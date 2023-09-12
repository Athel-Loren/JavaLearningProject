package md.tekwillacademy.variablesprogramme;

public class VariablesAndComments {
    public static void main(String[] args) {
        //Declare the variables

        //Truth based variables
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isStolen;
        boolean isBlocked;
        boolean isCharged;

        //Char related
        char condition;

        //Numeric Related
        byte numberOfSimCards;
        byte randomAccessMemory;

        short productionYear;

        int numberOfOwners;
        long id;
        float operatingSystemVersion;
        double price;

        //Initialize an IPhone
        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isStolen = false;
        isBlocked = true;
        isCharged = true;

        condition ='A';
        numberOfSimCards =2;
        randomAccessMemory =4;
        productionYear =2023;
        numberOfOwners =0;
        id = 24453454567658L;
        operatingSystemVersion =16.16F;
        price = 32456.8;
        // add comment with CTRL+?

        System.out.println("The Phone is charged " + isCharged);

        System.out.println("The Phone price is " + price);


    }
}
