package Model;

public class Mirrorless extends Camera {
    private final boolean hasEVF; 

    public Mirrorless(int id, String brand, String model, boolean isRented, boolean hasEVF) {
        super(id, brand, model, isRented);
        this.hasEVF = hasEVF;
    }

    @Override
    public void displayInfo() {
        String status = isRented() ? "Disewa" : "Tersedia";
        String evfStatus = hasEVF ? "Ada EVF" : "Tidak ada EVF";

        System.out.println();
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Status EVF: " + evfStatus); 
        System.out.println("Status: " + status);
    }
}
