package christmas.dto;

public class OrderMenuDTO {
    private final String name;
    private final Integer quantity;

    public OrderMenuDTO(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}