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
    private int computerNum;
    private int endOfArray;

    public static int getGlobalCount() {
        return globalCount;
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        resetGame();
        computerNum = random.nextInt(100) + 1;
        System.out.println("Начинаем игру!");
        System.out.println("У каждого игрока " + globalCount + " попыток");
        gameProcess();
        arraysDisplay();
    }

    private void gameProcess() {
        do {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            currentPlayer.setNum(scanner.nextInt());
            currentPlayer.addNumInArray();

            if (currentPlayer.getNum() < computerNum) {
                System.out.println("Число " + currentPlayer.getNum() + " меньше того, что загадал компьютер");
            } else if (currentPlayer.getNum() > computerNum) {
                System.out.println("Число " + currentPlayer.getNum() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал число " + computerNum + " с " + (globalCount - currentPlayer.getCount()) + " попытки");
            }

            if (currentPlayer.getCount() == 0) {
                System.out.println("У игрока " + currentPlayer.getName() + " кончились попытки");
            }

        } while (currentPlayer.getNum() != computerNum && (player1.getCount() != 0 || player2.getCount() != 0));
    }

    private void arraysDisplay() {
        System.out.print("Числа игрока " + player1.getName() + ": ");
        endOfArray = globalCount - player1.getCount();
        int[] numsCopy = Arrays.copyOf(player1.getNums(), endOfArray);
        for (int j : numsCopy) {
            System.out.print(j + " ");
        }
        Arrays.fill(player1.getNums(), 0, endOfArray, 0);
        System.out.print("\n");
        System.out.print("Числа игрока " + player2.getName() + ": ");
        endOfArray = globalCount - player2.getCount();
        numsCopy = Arrays.copyOf(player2.getNums(), endOfArray);
        for (int j : numsCopy) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
        Arrays.fill(player2.getNums(), 0, endOfArray, 0);
    }

    private void resetGame() {
        player1.setNum(0);
        player1.setCount(globalCount);
        player2.setNum(0);
        player2.setCount(globalCount);
    }
}