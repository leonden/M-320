package cars;

public class CrashedCar extends Car {

    public static final int LOW = 0;
    public static final int MEDIUM = 1;
    public static final int TOTAL = 2;

    private int damageLevel;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

@Override
    public double getPrice() {
            double newPrice = this.price;
            switch (this.damageLevel) {
                case LOW:
                    newPrice *= 0.9;
                    break;
                case MEDIUM:
                    newPrice *= 0.5;
                    break;
                case TOTAL:
                    newPrice = 0;
                    break;
            }
            return newPrice;
        }



    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
