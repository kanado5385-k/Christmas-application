package christmas.model;

public class Giveaway {
    private final String name;
    private final Integer quantity;

    public Giveaway() {
        this.name = "양송이수프";
        this.quantity = 1;
    }

    public String getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
