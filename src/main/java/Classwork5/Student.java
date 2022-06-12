package Classwork5;

public class Student {
    private String name;
    public int age;

    public static String str = "Human";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("My name is %s. I am %d years old.", name, age);
        System.out.println();
        System.out.print(str);
    }
    public void print() {
        System.out.println("NAME " + name);
        System.out.println("AGE " + age);
    }

    public Student(){
        System.out.println("Hallo");
        this.name = "Gleb";
    }
}
