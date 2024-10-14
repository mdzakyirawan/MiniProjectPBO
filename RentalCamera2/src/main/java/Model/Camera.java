package Model;

public abstract class Camera {
    private final int id; 
    private String brand;
    private String model;
    private boolean isRented;

    public Camera(int id, String brand, String model, boolean isRented) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.isRented = isRented;
    }

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

    public abstract void displayInfo();
}
