package christmas.model;

import java.util.Map;

import christmas.enums.TypeOfMenu;

public class Menu {
    private final Map<String,Integer> appetizer;
    private final Map<String,Integer> main;
    private final Map<String,Integer> dessert;
    private final Map<String,Integer> drink;

    public Menu() {
        this.appetizer = Map.of(
            "양송이수프", 6000,
            "타파스", 5500,
            "시저샐러드", 8000
        );

        this.main = Map.of(
            "티본스테이크", 55000,
            "바비큐립", 54000,
            "해산물파스타", 35000,
            "크리스마스파스타", 25000
        );

        this.dessert = Map.of(
            "초코케이크", 15000,
            "아이스크림", 5000
        );

        this.drink = Map.of(
            "제로콜라", 3000,
            "레드와인", 60000,
            "샴페인", 25000
        );
    }

    public TypeOfMenu checkTypeOfMenu(String menu) {
        if (appetizer.containsKey(menu)) {
            return TypeOfMenu.APPETIZER;
        }
        if (main.containsKey(menu)) {
            return TypeOfMenu.MAIN;
        }
        if (dessert.containsKey(menu)) {
            return TypeOfMenu.DESSERT;
        }
        if (drink.containsKey(menu)) {
            return TypeOfMenu.DRINK;
        }
        return TypeOfMenu.NONE;
    }

    public Integer getPriceOfMenu(String menu) {
        if (appetizer.containsKey(menu)) {
            return appetizer.get(menu);
        }
        if (main.containsKey(menu)) {
            return main.get(menu);
        }
        if (dessert.containsKey(menu)) {
            return dessert.get(menu);
        }
        if (drink.containsKey(menu)) {
            return drink.get(menu);
        }
        return null;
    }

}
