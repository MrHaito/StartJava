package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = (int) (Math.random() * 101);
        int playerNum = 47;
        while (playerNum != computerNum) {
            if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            } else if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            }
        }
        System.out.println("Вы победили");
    }
}