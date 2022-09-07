import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double sumInvoice() {
        double sum = 0;

        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public double calcVatOfSum() {
        double vatPerItem = 0;
        double vat = 7.7;

        for (Item item : items) {
            vatPerItem = item.getPrice() * vat / 100;
        }
        return sumInvoice() + Math.round(vatPerItem);
    }

    public void printInvoice() {
        System.out.println("+++++ Invoice +++++");

        for (Item item : items) {
            System.out.println(item.getText() + ": " + item.getPrice());
        }

        System.out.println();
        System.out.println("Rechnung exkl. MwSt: " + sumInvoice());
        System.out.println("Rechnung inkl. MwSt: " + calcVatOfSum());
    }

}

