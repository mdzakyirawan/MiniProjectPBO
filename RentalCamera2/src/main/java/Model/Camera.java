package model;

public abstract class Camera {
    private final int id; // Final property
    private String brand;
    private String model;
    private boolean isRented;

    // Constructor
    public Camera(int id, String brand, String model, boolean isRented) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.isRented = isRented;
    }

    // Getter dan Setter (Encapsulation)
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    // Method abstrak untuk menampilkan informasi kamera
    public abstract void displayInfo();
}
