import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        print(cart);
        cart.add("Logitech Tastatur MX");
        cart.add("HP Elitebook 840");
        cart.add("Dell Se24 Monitor");
        print(cart);
    }
    public static void print(ArrayList<String> cart) {
        if(cart.size() < 1) {
            System.out.println("cart empty");
        } else {
            for(String entry : cart) {
                System.out.println("- " + entry);
            }
        }
        System.out.println();
    }
}
