package Homework4Dog;

public class Homework4Dog {
    public static void main (String [] args){
        Dog first = new Dog ("Alex", 4, "brown", 73);
        Dog second = new Dog("Frisca", 12);

        System.out.println(first.getName());
        System.out.println(first.getAge());
        System.out.println(second.getColor());
        System.out.println(second.getHeight());


/*        first.printInfoDogs();
        System.out.println();
        second.printInfoDogs();
        first.setName(" ");
        first.printInfoDogs();*/
    }
}
