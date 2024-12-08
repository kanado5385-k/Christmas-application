package christmas.utilities;

import java.util.List;

import christmas.enums.messages.ErrorMessage;

public class Splitter {
    public static List<String> splitMenu(String menu) {
        return List.of(menu.split(","));
    }

    public static Integer splitOneMenu(String menu) {
        int delimiterIndex = menu.indexOf("-");
        if (delimiterIndex == -1){
            throw new IllegalArgumentException(ErrorMessage.WRONG_FORMAT_OF_ORDER.getMessage());
        }
        return delimiterIndex;
    }
}
