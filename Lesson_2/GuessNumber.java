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
        int computerNum = random.nextInt(101);
        currentPlayer = player2;
        System.out.println("Начинаем игру!");
        while (currentPlayer.getNumber() != computerNum) {
            currentPlayer = currentPlayer == player2 ? player1 : player2;
            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.setNumber(scanner.nextInt());
            if (currentPlayer.getNumber() < computerNum) {
                System.out.println("Число " + currentPlayer.getNumber() + " меньше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() > computerNum) {
                System.out.println("Число " + currentPlayer.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println(currentPlayer.getName() + " победил!");
            }
        }
        player1.setNumber(0);
        player2.setNumber(0);
    }
}