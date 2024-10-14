package model;

// Class Mirrorless mewarisi dari Camera
public class Mirrorless extends Camera {
    private final boolean hasEVF; // Final property (apakah memiliki Electronic View Finder)

    // Constructor
    public Mirrorless(int id, String brand, String model, boolean isRented, boolean hasEVF) {
        super(id, brand, model, isRented);
        this.hasEVF = hasEVF;
    }

    // Implementasi method displayInfo
    @Override
    public void displayInfo() {
        String status = isRented() ? "Disewa" : "Tersedia";
        String evfStatus = hasEVF ? "Ada EVF" : "Tidak ada EVF";
        System.out.println("ID: " + getId() + ", Brand: " + getBrand() + ", Model: " + getModel() + ", Status EVF: " + evfStatus + ", Status: " + status);
    }
}
