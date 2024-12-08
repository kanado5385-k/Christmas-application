package christmas.validation;

import java.util.HashSet;
import java.util.List;

import christmas.enums.TypeOfMenu;
import christmas.enums.messages.ErrorMessage;
import christmas.model.Menu;

public class OrderValidator {
    
    public static void validateOrderMenu(String name, Menu menu) {
        if(menu.checkTypeOfMenu(name) == TypeOfMenu.NONE) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_ORDER_NAME.getMessage()); 
        }
    }

    public static void validateOrderDuplication(List<String> orderMenu, String name) {
        HashSet<String> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(name);
        for (String oneName : orderMenu) {
            if (!uniqueNumbers.add(oneName)) {
                throw new IllegalArgumentException(ErrorMessage.DUPLICATE_ORDER_NAME.getMessage());
            }
        }
    }

    public static void validateOnlyDrink(List<String> orderNames, Menu menu) {
        for (String name : orderNames) {
            menu.checkTypeOfMenu(name);
            if(menu.checkTypeOfMenu(name) != TypeOfMenu.DRINK) {
                return; 
            }
        }
        throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_ORDER_TYPE.getMessage());
    }

    public static void validateOrderQuantity(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NATURAL_NUMBER.getMessage()); 
        }
    }

    public static void validateOrderQuantityLimit(int number) {
        if(number > 20) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_QUANTITY_LIMIT.getMessage()); 
        }
    }

}
