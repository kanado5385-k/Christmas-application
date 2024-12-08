package christmas.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import christmas.utilities.Parser;
import christmas.utilities.Splitter;
import christmas.validation.OrderValidator;

public class Order {
    private final Map<String,Integer> menu;

    public Order(String order, Menu menuEntity) {
        Map<String,Integer> menu = new HashMap<>();

        List<String> splittedMenu = Splitter.splitMenu(order);
        
        List<String> orderNames = new ArrayList<>();
        int totalQuantity = 0;
        for (String stringMenu : splittedMenu) {
            int delimiterIndex = Splitter.splitOneMenu(stringMenu);
            String name = stringMenu.substring(0,delimiterIndex);
            String quantity = stringMenu.substring(delimiterIndex + 1);

            OrderValidator.validateOrderMenu(name, menuEntity);
            OrderValidator.validateOrderDuplication(orderNames, name);
            orderNames.add(name);

            int intQuantity = Parser.parseNumberToInt(quantity);
            OrderValidator.validateOrderQuantity(intQuantity);
            totalQuantity += intQuantity;

            menu.put(name, intQuantity);
        }

        OrderValidator.validateOnlyDrink(orderNames, menuEntity);
        OrderValidator.validateOrderQuantityLimit(totalQuantity);

        this.menu = menu;

    }

    public Map<String,Integer> getOrderMenu() {
        return this.menu;
    }


}
