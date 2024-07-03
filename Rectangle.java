public class Rectangle {
    // Attributes of the Rectangle class
    private double width;
    private double height;

    // Constructor to initialize the Rectangle object
    public Rectangle(double width, double height) {
        this.width = width;   // Set the width attribute
        this.height = height; // Set the height attribute
    }

    // Getter method for the width attribute
    public double getWidth() {
        return width;
    }

    // Setter method for the width attribute
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for the height attribute
    public double getHeight() {
        return height;
    }

    // Setter method for the height attribute
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height; // Area formula: width * height
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height); // Perimeter formula: 2 * (width + height)
    }

    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Print the width and height of the rectangle
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

        // Calculate and print the area of the rectangle
        double area = rectangle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and print the perimeter of the rectangle
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}
