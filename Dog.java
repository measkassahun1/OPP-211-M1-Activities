public class Dog {
    // Name and breed attributes of Dog class
    private String name;
    private String breed;

    // Constructor to initialize the Dog object
    public Dog(String name, String breed) {
        this.name = name; // Set name attribute
        this.breed = breed; // Set breed attribute
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the breed attribute
    public String getBreed() {
        return breed;
    }

    // Setter method for the breed attribute
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Main method
    public static void main(String[] args) {
        // Create instances of Dog class
        Dog dog1 = new Dog("Max", "Bulldog");
        Dog dog2 = new Dog("Bella", "Poodle");

        // Modify the name and breed of 1st dog
        dog1.setName("Stanley");
        dog1.setBreed("Pitbull");
        // Modify the name and breed of 1st dog
        dog2.setName("Lola");
        dog2.setBreed("Labradoodle");

        // Printing the name and breed of dog 1
        System.out.println("Update Dog 1 Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        // Printing the name and breed of dog 2
        System.out.println("Update Dog 2 Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}