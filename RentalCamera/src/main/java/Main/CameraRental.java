package main;

import model.Camera;
import java.util.ArrayList;
import java.util.Scanner;

public class CameraRental {

    // Static ArrayList untuk menyimpan data kamera
    static ArrayList<Camera> cameraList = new ArrayList<>();
    static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        // Menu CRUD
        do {
            System.out.println("\nRental Kamera");
            System.out.println("1. Tambah Kamera");
            System.out.println("2. Tampilkan Semua Kamera");
            System.out.println("3. Update Status Kamera");
            System.out.println("4. Hapus Kamera");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addCamera(scanner);
                    break;
                case 2:
                    displayCameras();
                    break;
                case 3:
                    updateCameraStatus(scanner);
                    break;
                case 4:
                    deleteCamera(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (option != 5);
    }

    // Method untuk menambah kamera
    public static void addCamera(Scanner scanner) {
        System.out.print("Masukkan brand kamera: ");
        String brand = scanner.next();
        System.out.print("Masukkan model kamera: ");
        String model = scanner.next();

        // Membuat objek kamera baru dan menambahkannya ke dalam list
        Camera newCamera = new Camera(nextId++, brand, model, false);
        cameraList.add(newCamera);
        System.out.println("Kamera berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua kamera
    public static void displayCameras() {
        if (cameraList.isEmpty()) {
            System.out.println("Tidak ada kamera yang tersedia.");
        } else {
            System.out.println("\nDaftar Kamera:");
            for (Camera camera : cameraList) {
                camera.displayInfo();
            }
        }
    }

    // Method untuk mengupdate status kamera
    public static void updateCameraStatus(Scanner scanner) {
        System.out.print("Masukkan ID kamera yang ingin diupdate: ");
        int id = scanner.nextInt();
        Camera camera = findCameraById(id);

        if (camera != null) {
            System.out.println("Status saat ini: " + (camera.isRented() ? "Disewa" : "Tersedia"));
            System.out.print("Apakah ingin mengubah status menjadi (1 = Disewa, 0 = Tersedia): ");
            int status = scanner.nextInt();
            camera.setRented(status == 1);
            System.out.println("Status kamera berhasil diperbarui.");
        } else {
            System.out.println("Kamera dengan ID tersebut tidak ditemukan.");
        }
    }

    // Method untuk menghapus kamera
    public static void deleteCamera(Scanner scanner) {
        System.out.print("Masukkan ID kamera yang ingin dihapus: ");
        int id = scanner.nextInt();
        Camera camera = findCameraById(id);

        if (camera != null) {
            cameraList.remove(camera);
            System.out.println("Kamera berhasil dihapus.");
        } else {
            System.out.println("Kamera dengan ID tersebut tidak ditemukan.");
        }
    }

    // Method untuk mencari kamera berdasarkan ID
    public static Camera findCameraById(int id) {
        for (Camera camera : cameraList) {
            if (camera.getId() == id) {
                return camera;
            }
        }
        return null;
    }
}
