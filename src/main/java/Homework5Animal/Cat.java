package Homework5Animal;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals(" ")) {
            this.color = "unknown";
        }
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "unknown";
    }


/*    public void printInfoCats() {
        System.out.println("VEGAN " + getVegetarian());
        System.out.println("EATS " + getEats());
        System.out.println("NOOFLEGS " + getNoOfLegs());
        System.out.println("COLOR " + color);
    }*/
}
