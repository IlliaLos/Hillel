package Homework4Dog;

public class Dog {
    private String name;
    private int age;
    private String color;
    private int height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        if (name.equals(" ")){
            this.name = "unknown";
        }
    }

    public void setAge(int age) {
        if ((age < 0)&& (age > 20)) {
            this.age = 0;
        }
    }

    public void setColor(String color) {
        if (color.equals(" ")) {
            this.color = "unknown";
        }
    }

    public void setHeight(int height) {
        if (height < 0) {
            this.height = 0;
        }
    }

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "unknown";
        this.height = 0;
    }

/*    public void printInfoDogs() {
        System.out.println("NAME " + name);
        System.out.println("AGE " + age);
        System.out.println("COLOR " + color);
        System.out.println("HEIGHT " + height);
    }*/

    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }
}
