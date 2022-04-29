import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int count = 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int computerNum = random.nextInt(100) + 1;
        System.out.println("Начинаем игру!");
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.setNum(scanner.nextInt());
            if (currentPlayer.getNum() < computerNum) {
                System.out.println("Число " + currentPlayer.getNum() + " меньше того, что загадал компьютер");
            } else if (currentPlayer.getNum() > computerNum) {
                System.out.println("Число " + currentPlayer.getNum() + " больше того, что загадал компьютер");
            } else {
                System.out.println(currentPlayer.getName() + " победил!");
            }
        } while (currentPlayer.getNum() != computerNum);
        player1.setNum(0);
        player2.setNum(0);
    }
}