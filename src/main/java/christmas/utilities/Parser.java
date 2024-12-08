package christmas.utilities;

import christmas.enums.messages.ErrorMessage;

public class Parser {
    
    public static Integer parseNumberToInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(ErrorMessage.INVALID_INT_NUMBER.getMessage());
        }
    }
}
