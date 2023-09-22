package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {
    public static  boolean hasHeart = true; // Class variable
    public static boolean hasBrain;

    // Private - Instance variable because it defines the object of Person class
    private long idnp;
    String maritalStatus; // Default - Instance variable
    protected String name; // Protected - Instance variable
    public boolean isRetired; // Public - Instance variable

    public Person(){
        System.out.println("This is a defined constructor without params");
    }

    public Person(long idnp, String nameInput){
        this.idnp = idnp;
        name = nameInput;

        System.out.println("This is a defined constructor with 2 params");
    }

    public Person(long idnp, String name, String maritalStatus, boolean isRetired){
        this.idnp=idnp;
        this.maritalStatus=maritalStatus;
        this.name=name;
        this.isRetired=isRetired;
        System.out.println("This is a defined constructor with all the params");
    }

}
