import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int computerNum = random.nextInt(101);
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int count = 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void prepareGame() {
        if (currentPlayer == null) {
            currentPlayer = player1;
        }
    }

    public void startGame() {
        System.out.println("Начинаем игру!");
        while (currentPlayer.getNumber() != computerNum) {
            if (count % 2 == 0) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.setNumber(scanner.nextInt());
            if (currentPlayer.getNumber() < computerNum) {
                System.out.println("Число " + currentPlayer.getNumber() + " меньше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() > computerNum) {
                System.out.println("Число " + currentPlayer.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println(currentPlayer.getName() + " победил!");
            }
            count++;
        }
    }

    public void endGame() {
        count = 1;
        player1.setNumber(0);
        player2.setNumber(0);
        computerNum = random.nextInt(101);
    }
}