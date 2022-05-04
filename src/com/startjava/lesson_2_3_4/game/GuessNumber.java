package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private static int globalCount = 10;
    private int targetNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static int getGlobalCount() {
        return globalCount;
    }

    public void start() {
        initGame();
        targetNum = random.nextInt(100) + 1;
        System.out.println("Начинаем игру!");
        System.out.println("У каждого игрока " + globalCount + " попыток");
        startGame();
        displayPlayerNums();
    }

    private void initGame() {
        player1.fillZero();
        player1.setCount(0);
        player2.fillZero();
        player2.setCount(0);
    }

    private void startGame() {
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.addNum(scanner.nextInt());

            int playerNum = currentPlayer.getNums()[currentPlayer.getCount() - 1];

            if (playerNum == targetNum) {
                System.out.format("Игрок %s угадал число %d с %d попытки\n", currentPlayer.getName(), targetNum,
                        (currentPlayer.getCount()));
                break;
            }

            String answer = playerNum < targetNum
                    ? "Число " + playerNum + " меньше того, что загадал компьютер"
                    : "Число " + playerNum + " больше того, что загадал компьютер";
            System.out.println(answer);

            if (currentPlayer.getCount() == globalCount) {
                System.out.format("У игрока %s кончились попытки\n", currentPlayer.getName());
            }

        } while (player1.getCount() != globalCount || player2.getCount() != globalCount);
    }

    private void displayPlayerNums() {
        for (int i = 0; i < 2; i++) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            System.out.print("Числа игрока " + currentPlayer.getName() + ": ");
            int[] numsCopy = Arrays.copyOf(currentPlayer.getNums(), currentPlayer.getCount());
            for (int num : numsCopy) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }
}