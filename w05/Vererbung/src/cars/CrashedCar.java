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

    public double getPrice() {
            double newPrice = this.getPrice();
            switch (this.damageLevel) {
                case LOW: //case 0:
                    newPrice *= 0.9; // pr = pr * 0.9
                    break;
                case MEDIUM: // case 1:
                    newPrice *= 0.5;
                    break;
                case TOTAL: // case 2:
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
