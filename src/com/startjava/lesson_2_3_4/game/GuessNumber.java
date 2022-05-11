package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private Player[] players;
    private final int rounds = 3;
    private Player currentPlayer;
    private static final int GLOBAL_COUNT = 10;
    private int gamesCount = 0;
    private int currentNumOfPlayer;
    private int countOfFails = 0;
    private int targetNum;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public static int getGlobalCount() {
        return GLOBAL_COUNT;
    }

    public void start() {
        initGame();
        targetNum = random.nextInt(100) + 1;
        startGameplay();
        displayPlayerNums();
        if (gamesCount == rounds) {
            determineTheWinner();
            gamesCount = 0;
        }
    }

    private void initGame() {
        currentNumOfPlayer = random.nextInt(players.length);
        System.out.println("Начинаем игру!");
        System.out.println("У каждого игрока " + GLOBAL_COUNT + " попыток");
        System.out.println("Первым начинает игрок " + players[currentNumOfPlayer].getName());
        for (int i = 0; i < players.length; i++) {
            players[i].fillZero();
            players[i].setCountOfCurrectNumber(0);
            players[i].setGlobalCount(0);
        }
    }

    private void startGameplay() {
        do {
            changePlayer();
            System.out.print(currentPlayer.getName() + " введите число от 0 до 100: ");
            int playerNum = currentPlayer.addNum(scanner.nextInt());

            if (playerNum == targetNum) {
                System.out.format("Игрок %s угадал число %d с %d попытки\n",
                        currentPlayer.getName(), targetNum, currentPlayer.getGlobalCount());
                currentPlayer.setCountOfWins(currentPlayer.getCountOfWins() + 1);
                gamesCount++;
                break;
            }

            String answer = playerNum < targetNum ? "меньше" : "больше";
            System.out.format("Число %d %s того, что загадал компьютер\n", playerNum, answer);

            if (currentPlayer.getGlobalCount() == GLOBAL_COUNT) {
                System.out.format("У игрока %s кончились попытки\n", currentPlayer.getName());
                countOfFails++;
            }
        } while (countOfFails < players.length);
    }

    private void changePlayer() {
        currentPlayer = players[currentNumOfPlayer];
        currentNumOfPlayer++;
        if (currentNumOfPlayer >= players.length) {
            currentNumOfPlayer = 0;
        }
    }

    private void displayPlayerNums() {
        for (int i = 0; i < players.length; i++) {
            changePlayer();
            System.out.print("Числа игрока " + currentPlayer.getName() + ": ");
            for (int num : currentPlayer.getNums()) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }

    private void determineTheWinner() {
        Player winner = players[0];
        boolean draw = true;

        if (players.length == rounds) {
            for (int i = 0; i < players.length - 1; i++) {
                if (players[i].getCountOfWins() != players[i + 1].getCountOfWins()) {
                    draw = false;
                    break;
                }
            }
        } else {
            draw = false;
        }

        if (draw) {
            System.out.format("По итогам %d игр - ничья\n", rounds);
        } else {
            for (Player player : players) {
                if (player.getCountOfWins() > winner.getCountOfWins()) {
                    winner = player;
                }
            }
            System.out.format("По итогам %d игр победил игрок %s\n", rounds, winner.getName());
        }
    }
}