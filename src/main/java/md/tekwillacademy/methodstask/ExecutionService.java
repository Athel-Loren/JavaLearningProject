package md.tekwillacademy.methodstask;

import java.util.SortedMap;

public class ExecutionService {

    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100)); //getRandomInt - metoda statica
        System.out.println(DataGeneratorUtil.getRandomInt(100,200));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getTandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getTandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getTandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getTandomEmail("gmail.com"));


        Customer customer1 = new Customer("Fat Frumos", "Masculin", 20);
        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(85);
        System.out.println(customer1.toString());

        customer1.setName("Fat Cosanzeana");
        System.out.println(customer1.toString());

        System.out.println("Virsta este: " +customer1.getAge());
        System.out.println("Familia este: " +customer1.getName());


    }
}
