package christmas.model;

import java.util.Map;

import christmas.utilities.Parser;
import christmas.validation.DateValidator;

public class Order {
    private final Integer date;
    private final Map<String,Integer> menu;

    public Order(String date, String menu) {
        int intDate = Parser.parseNumberToInt(date);
        DateValidator.validateDate(intDate);

        
    }
}
