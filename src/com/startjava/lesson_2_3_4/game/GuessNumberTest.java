package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];

        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя игрока: ");
            players[i] = new Player(scanner.nextLine());
        }

        GuessNumber game = new GuessNumber(players);

        String answer = "";
        while (!answer.equals("no")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}