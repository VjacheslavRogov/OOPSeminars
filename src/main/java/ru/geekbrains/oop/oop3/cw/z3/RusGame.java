package ru.geekbrains.oop.oop3.cw.z3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RusGame extends AbstractGame {

    @Override
    List<String> generateChatList() {
        String[] alphabet = {"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я"};
        List<String> result = new ArrayList<>(Arrays.asList(alphabet));
        return result;
    }
}
