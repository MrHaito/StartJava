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

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
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
        changePlayer();
        do {

            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.addNum(scanner.nextInt());

            int playerNum = currentPlayer.getNums()[currentPlayer.getCount() - 1];

            if (playerNum == targetNum) {
                System.out.format("Игрок %s угадал число %d с %d попытки\n", currentPlayer.getName(), targetNum,
                        currentPlayer.getCount());
                break;
            }

            String answer = playerNum < targetNum ? "меньше" : "больше";
            System.out.format("Число %d %s того, что загадал компьютер\n", playerNum, answer);

            if (currentPlayer.getCount() == globalCount) {
                System.out.format("У игрока %s кончились попытки\n", currentPlayer.getName());
            }

        } while (player1.getCount() != globalCount || player2.getCount() != globalCount);
    }

    private void displayPlayerNums() {
        for (int i = 0; i < 2; i++) {
            changePlayer();

            System.out.print("Числа игрока " + currentPlayer.getName() + ": ");
            for (int num : currentPlayer.getNums()) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }
}