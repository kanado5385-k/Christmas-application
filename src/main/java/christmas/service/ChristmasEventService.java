package christmas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import christmas.dto.OrderMenuDTO;
import christmas.model.Giveaway;
import christmas.model.Order;

public class ChristmasEventService {
    private Integer totalOrderPrice = 0;
    private Integer totalSellPrice = 0;
    Giveaway giveaway;

    public List<OrderMenuDTO> createOrderMenuDTO(Order order) {
        List<OrderMenuDTO> dto = new ArrayList<>();
        Map<String,Integer> orderMenu = order.getOrderMenu();

        List<String> names = new ArrayList<>(orderMenu.keySet());
        List<Integer> quantity = new ArrayList<>(orderMenu.values());

        for (int i = 0; i < names.size(); i++) {
            String oneName = names.get(i);
            Integer oneQuantity = quantity.get(i);
            dto.add(new OrderMenuDTO(oneName, oneQuantity));
        }

        return dto;
    }

    
}
