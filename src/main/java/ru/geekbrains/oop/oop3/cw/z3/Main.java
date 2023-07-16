package ru.geekbrains.oop.oop3.cw.z3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner1 = new Scanner(System.in);
//        Integer switch1 = scanner1.nextInt();
//        TypeGame typeGame = null;
//        if (switch1 == 1) {
//            typeGame = TypeGame.RUSGAME;
//        } else if (switch1 == 2) {
//            typeGame = TypeGame.ENGGAME;
//        } else if (switch1 == 3) {
//            typeGame = TypeGame.NUMGAME;
//        } else{
//            System.out.println("Введены не верные данные");
//        }
//        switch (typeGame) {
//            case RUSGAME -> RusGame switchGame = new RusGame();
//            case ENGGAME -> System.out.println("Английский");
//            case NUMGAME -> System.out.println("Цифры");
//            default -> System.out.println("Фрукт не найден");
//        }

        RusGame rusGame = new RusGame();
        Scanner scanner = new Scanner(System.in);
        rusGame.start(scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        while (!rusGame.getGameStatus().equals(GameStatus.FINISH)) {
            String value = scanner.nextLine().toString();
            Answer answer = rusGame.inputValue(value);
            if (answer != null) {
                System.out.println("answer = " + answer);
            }
        }
    }
}
