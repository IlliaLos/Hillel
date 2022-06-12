package Classwork5;

public class Lesson5Student {
    public static void main (String [] args){
        Student misha = new Student("Misha", 25);
        Student yana = new Student("Yana", 23);
        Student pasha = new Student("Pasha", 27);
        misha.printInfo();
        System.out.println();
        yana.printInfo();
        System.out.println();
        System.out.println();
        Student.str = "Animal";
        pasha.printInfo();
        System.out.println();
        pasha.print();
        System.out.println(Student.str);
        System.out.println();
        yana.age = 45;
        yana.printInfo();
        System.out.println();
        System.out.println();
        Student novyj = new Student();
        novyj.print();


    }
}
