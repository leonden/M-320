package cars;

public class Main {
    public static void main(String[] args) {
        CrashedCar cc = new CrashedCar("BMW M3", 10000, CrashedCar.LOW);
        print("low", 10000 * 0.9, cc.getPrice());

        cc.setDamageLevel(CrashedCar.MEDIUM);
        print("medium", 10000 * 0.5, cc.getPrice());

        cc.setDamageLevel(CrashedCar.TOTAL);
        print("total", 0, cc.getPrice());

        double price = 80000;
        UsedCar uc = new UsedCar("Audi A6", price, 0);
        print("u0", price, uc.getPrice());

        uc.setMileage(10000);
        print("u10000", 76000, uc.getPrice());

        uc.setMileage(200000);
        print("u200000", 0, uc.getPrice());

        uc.setMileage(210000);
        print("u210000", 0, uc.getPrice());

        MobilityCar mc = new MobilityCar("Tesla Model 3", price,6);
        print("123", 432, mc.getPrice());
    }

    private static void print(String id, double expected, double effective) {
        System.out.println(id + " expected " + expected + ", effective: " + effective);
    }

}
