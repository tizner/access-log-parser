import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ведите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Ведите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int summ = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int multi = firstNumber * secondNumber;
        double quotient = (double)  firstNumber / secondNumber;

        System.out.println("Сумма чисел: "+ summ);
        System.out.println("Разность чисел: "+ diff);
        System.out.println("Произведение чисел: "+ multi);
        System.out.println("Частное чисел: "+ quotient);


    }
}
