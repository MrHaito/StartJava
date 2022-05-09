package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private Player[] players = new Player[3];
    private Player currentPlayer;
    private static int globalCount = 10;
    private static int gamesCount = 0;
    private int targetNum;
    private int countOfPlayers;
    private Player[] winners = new Player[3];

    public GuessNumber(Player player1, Player player2, Player player3) {
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
    }

    public static int getGlobalCount() {
        return globalCount;
    }

    private void changePlayer() {
        switch (countOfPlayers) {
            case 0 -> currentPlayer = players[0];
            case 1 -> currentPlayer = players[1];
            case 2 -> currentPlayer = players[2];
        }
        countOfPlayers++;
        if (countOfPlayers >= 3) {
            countOfPlayers = 0;
        }
    }

    public void start() {
        initGame();
        targetNum = random.nextInt(100) + 1;
        System.out.println("У каждого игрока " + globalCount + " попыток");
        startGame();
        displayPlayerNums();
    }

    private void initGame() {
        countOfPlayers = random.nextInt(3);
        System.out.println("Начинаем игру!");
        System.out.println("Первым начинает игрок " + players[countOfPlayers].getName());
        for (int i = 0; i < 3; i++) {
            players[i].fillZero();
            players[i].setArrayCount(0);
            players[i].setCount(0);
        }
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
                winners[gamesCount] = currentPlayer;
                gamesCount++;
                if (gamesCount == 3) {
                    ckeckWinner(winners);
                    gamesCount = 0;
                }
                break;
            }

            String answer = playerNum < targetNum ? "меньше" : "больше";
            System.out.format("Число %d %s того, что загадал компьютер\n", playerNum, answer);

            if (currentPlayer.getCount() == globalCount) {
                System.out.format("У игрока %s кончились попытки\n", currentPlayer.getName());
            }

        } while (players[0].getCount() != globalCount || players[1].getCount() != globalCount ||
                players[2].getCount() != globalCount);
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

    private void ckeckWinner(Player winners[]) {
        int winGamesP1 = 0;
        int winGamesP2 = 0;
        int winGamesP3 = 0;
        for (int i = 0; i < winners.length; i++) {
            if (winners[i] == players[0]) {
                winGamesP1++;
            } else if (winners[i] == players[1]) {
                winGamesP2++;
            } else if (winners[i] == players[2]) {
                winGamesP3++;
            }
        }
        if (winGamesP1 == winGamesP2 && winGamesP1 == winGamesP3) {
            System.out.println("По итогам 3-х игр - ничья");
        } else {
            int numOfWinner = Math.max(winGamesP1, Math.max(winGamesP2, winGamesP3));
            System.out.println("По итогам 3-х игр победил игрок " + winners[numOfWinner].getName());
        }
    }
}