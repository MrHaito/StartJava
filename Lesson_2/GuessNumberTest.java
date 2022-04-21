import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        while (!answer.equals("no")) {
            guessNumber.prepareGame();
            guessNumber.startGame();
            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                        System.out.print("Хотите продолжить игру? [yes/no]: ");
                        answer = scanner.nextLine();
            }
            guessNumber.endGame();
        }
    }
}