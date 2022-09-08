public class Item {
    private String text;
    private double price;

    Item(String text, double price) {
        this.text = text;
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public double getPrice() {
        return price;
    }
}
