import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;

        while(continueCalculations) {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            calculator.calculation();
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            scanner.nextLine();
            String answer = scanner.nextLine();
            boolean correctAnswer = false;
            while (!correctAnswer) {
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                }
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("yes")) {
                continueCalculations = true;
            } else if (answer.equals("no")) {
                continueCalculations = false;
            }
            
        }
    }
}