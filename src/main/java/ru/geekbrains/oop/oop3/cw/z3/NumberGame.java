package ru.geekbrains.oop.oop3.cw.z3;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {

    @Override
    List<String> generateChatList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}
