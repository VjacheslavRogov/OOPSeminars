package ru.geekbrains.oop.oop3.cw.z3;

public interface Game {

    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
