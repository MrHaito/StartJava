import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int computerNum = random.nextInt(101);
    Player player1;
    Player player2;
    Player currentPlayer = player1;
    int count = 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void startGame() {
        player1.setNumber(0);
        player2.setNumber(0);
        while (currentPlayer.getNumber() != computerNum) {
            if (count % 2 == 0) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            System.out.print(currentPlayer.getName() + " введите число от 0 до 100");
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
}