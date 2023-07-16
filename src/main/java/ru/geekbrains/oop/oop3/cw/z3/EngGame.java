package ru.geekbrains.oop.oop3.cw.z3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngGame extends AbstractGame {

    @Override
    List<String> generateChatList() {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> result = new ArrayList<>(Arrays.asList(alphabet));
        return result;
    }
}