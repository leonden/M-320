import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        print(cart);
        cart.add("Strawberries");
        cart.add("Mango");
        cart.add("Apples");
        print(cart);
        cart.remove(2);
        print(cart);
    }

    public static void print(ArrayList<String> cart) {
        int amount = 0;
        if(cart.size() < 1) {
            System.out.println("cart empty");
        } else {
            for(String entry : cart) {
                System.out.println("- " + entry);
                amount++;
            }

            System.out.println("Total items: " + amount);
        }

        System.out.println();
    }
}
