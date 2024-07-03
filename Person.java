public class Person {
    // Name and Age attributes for Person class
    private String name;
    private int age;

    // Constructor to initialize the person object
    public Person(String name, int age){
        this.name = name; //Sets the name attribute
        this.age = age; //Sets the age attribute
    }

    // Getter Method: allow access for the name attribute in person class
    public String getName() {
        return name;
    }

    // Getter Method: allow access for the age attribute in person class
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        // Create 1st instance of the person class
        Person person1 = new Person("Sam", 35);
        // Create 2nd instance of the person class
        Person person2 = new Person("Dean", 28);

    // Printing: Name and age of person 1
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        // Printing: Name and age of person 2
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}

