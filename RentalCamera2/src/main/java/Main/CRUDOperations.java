package main;

// Interface untuk operasi CRUD
public interface CRUDOperations {
    void addCamera();
    void displayCameras();
    void updateCameraStatus(int id);
    void deleteCamera(int id);
}
