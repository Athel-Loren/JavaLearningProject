package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage autoDocGarage;
        // o sa creeze 3 celule de memorie goale
        // 3 celule = 3 proprietati a classei Garage

        autoDocGarage= new Garage();
        autoDocGarage.address="Stefan cel Mare, IHub 64";
        autoDocGarage.surfaceM2=450.0F;

        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati " +autoDocGarage.address
                + " " + autoDocGarage.surfaceM2 + " " + autoDocGarage.capacity);

        autoDocGarage.capacity=50;
        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati " +autoDocGarage.address
                + " " + autoDocGarage.surfaceM2 + " " + autoDocGarage.capacity);

        Garage garajIaloveni = new Garage();
        System.out.println("Obiectul garajIaloveni are urmatoarele proprietati " +garajIaloveni.address
                + " " + garajIaloveni.surfaceM2 + " " + garajIaloveni.capacity);


        Worker vasile = new Worker();
        vasile.name="Vasile";
        vasile.age=54;

        System.out.println("Obiectul are numele de "+vasile.name + " si are "+ vasile.age+" ani.");

        //Worker ion= new Worker();

        Person client1 =new Person("+37379277943");
        //Person client10 = new Person();  va apela constructorul fara parametri

        Car porscheNKK132 = new Car("AsdDD32", "Posche Cayenne", client1);

        Car mercedesBenzTransit = new Car("Ddd345", "Mercedes",
                new Person("435365376737"));
        System.out.println("Masina este "+porscheNKK132.mark + " si proprietarul poate fi apelat la  "+ porscheNKK132.owner.phoneNumber);
        System.out.println("Masina este "+mercedesBenzTransit.mark + " si proprietarul poate fi apelat la  "+ mercedesBenzTransit.owner.phoneNumber);



    }
}
