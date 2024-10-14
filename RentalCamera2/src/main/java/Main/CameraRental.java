package Main;

import Model.Camera;
import Model.DSLR;
import Model.Mirrorless;

import java.util.ArrayList;
import java.util.Scanner;

public final class CameraRental implements CRUD {

    static ArrayList<Camera> cameraList = new ArrayList<>();
    static int nextId = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CameraRental rental = new CameraRental();
        int option;

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
                    rental.addCamera();
                    break;
                case 2:
                    rental.displayCameras();
                    break;
                case 3:
                    System.out.print("Masukkan ID kamera yang ingin diupdate: ");
                    int id = scanner.nextInt();
                    rental.updateCameraStatus(id);
                    break;
                case 4:
                    System.out.print("Masukkan ID kamera yang ingin dihapus: ");
                    int deleteId = scanner.nextInt();
                    rental.deleteCamera(deleteId);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (option != 5);
    }

    @Override
    public void addCamera() {
        System.out.println("Pilih tipe kamera: 1. DSLR, 2. Mirrorless");
        int type = scanner.nextInt();

        System.out.print("Masukkan brand kamera: ");
        String brand = scanner.next();
        System.out.print("Masukkan model kamera: ");
        String model = scanner.next();

        if (type == 1) {
            System.out.print("Masukkan jenis lensa: ");
            String lensType = scanner.next();
            Camera dslr = new DSLR(nextId++, brand, model, false, lensType);
            cameraList.add(dslr);
        } else if (type == 2) {
            System.out.print("Apakah memiliki EVF (1 = Ya, 0 = Tidak): ");
            boolean hasEVF = scanner.nextInt() == 1;
            Camera mirrorless = new Mirrorless(nextId++, brand, model, false, hasEVF);
            cameraList.add(mirrorless);
        } else {
            System.out.println("Tipe kamera tidak valid.");
        }

        System.out.println("Kamera berhasil ditambahkan.");
    }

    @Override
    public void displayCameras() {
        if (cameraList.isEmpty()) {
            System.out.println("Tidak ada kamera yang tersedia.");
        } else {
            System.out.println("\nDaftar Kamera:");
            for (Camera camera : cameraList) {
                camera.displayInfo();
            }
        }
    }

    @Override
    public void updateCameraStatus(int id) {
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

    @Override
    public void deleteCamera(int id) {
        Camera camera = findCameraById(id);

        if (camera != null) {
            cameraList.remove(camera);
            System.out.println("Kamera berhasil dihapus.");
        } else {
            System.out.println("Kamera dengan ID tersebut tidak ditemukan.");
        }
    }

    public Camera findCameraById(int id) {
        for (Camera camera : cameraList) {
            if (camera.getId() == id) {
                return camera;
            }
        }
        return null;
    }
}

