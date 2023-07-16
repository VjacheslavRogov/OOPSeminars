package ru.geekbrains.oop.oop3.cw.z3;

public enum TypeGame {
    RUSGAME(1), ENGGAME(2), NUMGAME(3);

    private final int number;

    TypeGame(int number) { this.number = number; }

    public int getNumber() { return number; }
}
