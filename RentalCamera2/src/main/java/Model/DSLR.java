package Model;

public class DSLR extends Camera {
    private final String lensType; 

    public DSLR(int id, String brand, String model, boolean isRented, String lensType) {
        super(id, brand, model, isRented);
        this.lensType = lensType;
    }

    @Override
    public void displayInfo() {
        String status = isRented() ? "Disewa" : "Tersedia";
        System.out.println();
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Lensa: " + lensType ); 
        System.out.println("Status: " + status);
    }
}
