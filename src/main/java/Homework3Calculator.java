import java.util.Scanner;

public class Homework3Calculator {
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
                System.out.println(sum(chislo1,chislo2));
            } else if (symbol.equals("-")) {
                System.out.println(subt(chislo1,chislo2));
            } else if (symbol.equals("*")) {
                System.out.println(multipl(chislo1,chislo2));
            } else if (symbol.equals("%")) {
                System.out.println(proc(chislo1,chislo2));
            } else{
                if (chislo2 != 0){
                    System.out.println(div(chislo1,chislo2));
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
    private static int sum (int chislo1, int chislo2){
        int result = chislo1 + chislo2;
        return result;
    }
    private static int subt (int chislo1, int chislo2){
        int result = chislo1 - chislo2;
        return result;
    }
    private static int multipl (int chislo1, int chislo2){
        int result = chislo1 * chislo2;
        return result;
    }
    private static int proc (int chislo1, int chislo2){
        float result = (float)chislo1 / chislo2 * 100;
        return (int)result;
    }
    private static int div (int chislo1, int chislo2){
        int result = chislo1 / chislo2;
        return result;
    }
}
