package Homework5Animal;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public boolean getVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public Animal() {
        System.out.println("Find your animal");
    }
}
