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
    private static int globalCount = 2;
    private int targetNum;

    public static int getGlobalCount() {
        return globalCount;
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        initGame();
        targetNum = random.nextInt(100) + 1;
        System.out.println("Начинаем игру!");
        System.out.println("У каждого игрока " + globalCount + " попыток");
        play();
        displayPlayerNums();
    }

    private void play() {
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.addNum(scanner.nextInt());

            if (currentPlayer.getNums()[currentPlayer.getCount() - 1] < targetNum) {
                System.out.format("Число %d %s того, что загадал компьютер\n", currentPlayer.getNums()[currentPlayer.getCount() - 1], "меньше");
            } else if (currentPlayer.getNums()[currentPlayer.getCount() - 1] > targetNum) {
                System.out.format("Число %d %s того, что загадал компьютер\n", currentPlayer.getNums()[currentPlayer.getCount() - 1], "больше");
            } else {
                System.out.format("Игрок %s угадал число %d с %d попытки\n", currentPlayer.getName(), targetNum, (currentPlayer.getCount()));
                break;
            }

            if (currentPlayer.getCount() == globalCount) {
                System.out.format("У игрока %s кончились попытки\n", currentPlayer.getName());
            }

        } while (player1.getCount() != globalCount || player2.getCount() != globalCount);
    }

    private void displayPlayerNums() {
        int count = 0;
        while (count < 2) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            System.out.print("Числа игрока " + currentPlayer.getName() + ": ");
            int[] numsCopy = Arrays.copyOf(currentPlayer.getNums(), currentPlayer.getCount());
            for (int num : numsCopy) {
                System.out.print(num + " ");
            }
            count++;
            System.out.print("\n");
        }
    }

    private void initGame() {
        int count = 0;
        while (count < 2) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            currentPlayer.fillZero();
            currentPlayer.setCount(0);
            count++;
        }

    }
}