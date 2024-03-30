// Abstract class Vegetable
abstract class Vegetable {
    String color;

    // Constructor
    public Vegetable(String color) {
        this.color = color;
    }

    // Abstract method
    abstract String getName();

    // Override toString() method
    @Override
    public String toString() {
        return getName() + " (Color: " + color + ")";
    }
}

// Subclass Potato
class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    String getName() {
        return "Potato";
    }
}

// Subclass Brinjal
class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    String getName() {
        return "Brinjal";
    }
}

// Subclass Tomato
class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    String getName() {
        return "Tomato";
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of vegetable objects
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        // Displaying vegetable objects
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}