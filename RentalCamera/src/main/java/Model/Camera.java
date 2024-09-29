package model;

public class Camera {
    private int id;
    private String brand;
    private String model;
    private boolean isRented; // Menyimpan status apakah kamera disewa

    // Constructor
    public Camera(int id, String brand, String model, boolean isRented) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.isRented = isRented;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    // Method untuk menampilkan informasi kamera
    public void displayInfo() {
        String status = isRented ? "Disewa" : "Tersedia";
        System.out.println("");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Status: " + status);
        System.out.println("");
    }
}
