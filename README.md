# PBO Manajemen Rental Kamera
Program ini bertujuan untuk mempermudah proses pengelolaan penyewaan kamera di sebuah layanan rental. Program ini akan membantu dalam melakukan operasi CRUD (Create, Read, Update, Delete) terkait dengan data kamera. Sistem ini juga mendukung fitur pengelolaan ketersediaan kamera.

## Fitur
- Tambah Kamera: Menambahkan kamera baru ke dalam daftar rental.
- Tampilkan Semua Kamera: Menampilkan daftar semua kamera yang tersedia, beserta statusnya (Disewa atau Tersedia).
- Update Status Kamera: Mengubah status kamera apakah sedang disewa atau tersedia.
- Hapus Kamera: Menghapus kamera dari daftar rental.
- Keluar: Menghentikan program.

## Struktur Program
Program ini dibagi menjadi dua package utama:

- main: Berisi logika utama aplikasi.
- model: Berisi class Camera yang merepresentasikan data kamera.

### Class dan Package
- model.Camera: Class ini merepresentasikan sebuah kamera dengan properti:

  - id: ID kamera.
  - brand: Merek kamera.
  - model: Model kamera.
  - isRented: Status kamera (Disewa atau Tersedia).

### Method yang tersedia:
  - displayInfo(): Menampilkan informasi lengkap kamera.
- main.CameraRental: Class ini berfungsi sebagai program utama yang menyediakan menu untuk mengelola kamera dengan operasi CRUD.

# Output

***Menu Utama***\
![image](https://github.com/user-attachments/assets/aec4fd3d-058a-46e7-958b-b3f9e4502cc7)


***Tambah Kamera***\
![image](https://github.com/user-attachments/assets/df3dd107-33af-4884-9513-ef343820a11e)


***Tampilkan Semua Kamera***\
![image](https://github.com/user-attachments/assets/d8cd9f51-89f2-4449-b04e-ed68da4e35e4)


***Update Status Kamera***\
![image](https://github.com/user-attachments/assets/887e0f00-cfb8-4fdf-b774-334473fb9e29)


***Hapus Kamera***\
![image](https://github.com/user-attachments/assets/67f13604-9efd-4c5f-8073-eba151626225)


***Keluar***\
![image](https://github.com/user-attachments/assets/e769c47e-3c6e-49ec-af64-e5b67e44f68e)
