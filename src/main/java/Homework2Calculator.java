import java.util.Scanner;

public class Homework2Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int chislo1 = scan.nextInt();
        System.out.println("Введите второе число");
        int chislo2 = scan.nextInt();
        System.out.println("Введите символ операции");
        String symbol = scan.next();
        if (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("/") && !symbol.equals("*") && !symbol.equals("%")){
            System.out.println("Error");
        } else {
            if (symbol.equals("+")){
                System.out.println(chislo1 + chislo2);
            } else if (symbol.equals("-")) {
                System.out.println(chislo1 - chislo2);
            } else if (symbol.equals("*")) {
                System.out.println(chislo1 * chislo2);
            } else if (symbol.equals("%")) {
                System.out.println(chislo2 % chislo1);
            } else{
                if (chislo2 != 0){
                    System.out.println(chislo1 / chislo2);
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
}
