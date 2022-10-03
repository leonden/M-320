package cars;

public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String model, double price, int mileage) {
        super(model, price);
    }

    @Override
    public double getPrice() {
            double pricePerKm = (this.price / 100) * 0.0005;
            double newPrice = this.price - (pricePerKm * this.mileage);
            if(newPrice < 0) {
                newPrice = 0;
            }
            return newPrice;
        }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
