package ru.geekbrains.oop.oop3.cw.z3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger("Main");
    public static void main(String[] args) {
        System.out.println("Выберите вариант игры:" +
                "\n1) Русские буквы;" +
                "\n2) Английские буквы;" +
                "\n3) Цифры;");
        Scanner scanner1 = new Scanner(System.in);
        boolean isNumeric = false;
        while (!isNumeric) {
            try {
                Integer switch1 = scanner1.nextInt();
                isNumeric = true;
                if (switch1 == 1) {
                    RusGame rusGame = new RusGame();
                    System.out.println("Введите количество символов:" +
                            "\nВведите количество попыток:");
                    Scanner scanner2 = new Scanner(System.in);
                    rusGame.start(scanner2.nextInt(), scanner2.nextInt());
                    scanner2.nextLine();
                    System.out.println("Игра началась");
                    while (!rusGame.getGameStatus().equals(GameStatus.FINISH)) {
                        String value = scanner2.nextLine().toString().toLowerCase();
                        Answer answer = rusGame.inputValue(value);
                        if (answer != null) {
                            System.out.println("Ваши результаты: " +
                                    "\nБыков: " + answer.getBull() +
                                    "\nКоров: " + answer.getCow() +
                                    "\nПопытка: " + answer.getNumTry());
                        }
                    }
                    logger.info("message");
                } else if (switch1 == 2) {
                    EngGame engGame = new EngGame();
                    Scanner scanner2 = new Scanner(System.in);
                    engGame.start(scanner2.nextInt(), scanner2.nextInt());
                    scanner2.nextLine();
                    while (!engGame.getGameStatus().equals(GameStatus.FINISH)) {
                        String value = scanner2.nextLine().toString().toLowerCase();
                        Answer answer = engGame.inputValue(value);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                } else if (switch1 == 3) {
                    NumberGame numberGame = new NumberGame();
                    Scanner scanner2 = new Scanner(System.in);
                    numberGame.start(scanner2.nextInt(), scanner2.nextInt());
                    scanner2.nextLine();
                    while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                        String value = scanner2.nextLine().toString().toLowerCase();
                        Answer answer = numberGame.inputValue(value);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                } else {
                    System.out.println("Введены не верные данные");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Выберите номер из списка");
                scanner1.nextLine();
            }
        }
    }
}
