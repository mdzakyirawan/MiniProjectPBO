package model;

// Class DSLR mewarisi dari Camera
public class DSLR extends Camera {
    private final String lensType; // Final property

    // Constructor
    public DSLR(int id, String brand, String model, boolean isRented, String lensType) {
        super(id, brand, model, isRented);
        this.lensType = lensType;
    }

    // Implementasi method displayInfo
    @Override
    public void displayInfo() {
        String status = isRented() ? "Disewa" : "Tersedia";
        System.out.println("ID: " + getId() + ", Brand: " + getBrand() + ", Model: " + getModel() + ", Lensa: " + lensType + ", Status: " + status);
    }
}
