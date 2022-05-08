package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Player player3;
    private Player[] players = new Player[3];
    private Player currentPlayer;
    private static int globalCount = 10;
    private int targetNum;
    private int countOfPlayers;

    public GuessNumber(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        players[0] = this.player1;
        this.player2 = player2;
        players[1] = this.player2;
        this.player3 = player3;
        players[2] = this.player3;
    }

    public static int getGlobalCount() {
        return globalCount;
    }

    private void changePlayer() {
        switch (countOfPlayers) {
            case 0 -> currentPlayer = player1;
            case 1 -> currentPlayer = player2;
            case 2 -> currentPlayer = player3;
        }
        countOfPlayers++;
        if (countOfPlayers >= 3) {
            countOfPlayers = 0;
        }
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
        countOfPlayers = random.nextInt(3);
        System.out.println(countOfPlayers);
        player1.fillZero();
        player1.setCount(0);
        player2.fillZero();
        player2.setCount(0);
        player3.fillZero();
        player3.setCount(0);
    }

    private void startGame() {
        do {
            changePlayer();

            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");

            int playerNum = scanner.nextInt();
            currentPlayer.addNum(playerNum);

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
        for (int i = 0; i < 3; i++) {
            changePlayer();

            System.out.print("Числа игрока " + currentPlayer.getName() + ": ");
            for (int num : currentPlayer.getNums()) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }
}