package poly.exercise.library.models;

public class Media extends Library {
    private String name;
    private boolean rentalStatus;

    public Media(String name, boolean rentalStatus) {
    }

    public void printInformation() {
    }

    public double getFee() {
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
}
