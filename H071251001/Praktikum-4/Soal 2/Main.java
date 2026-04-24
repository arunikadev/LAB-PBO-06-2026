import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Product> daftarProduk = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Product");
            System.out.println("2. Tampilkan Semua Product");
            System.out.println("3. Beli Product");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    input.nextLine();

                    System.out.print("Masukkan merk: ");
                    String merk = input.nextLine();

                    System.out.print("Masukkan nomor seri: ");
                    int seri = input.nextInt();

                    System.out.print("Masukkan harga: ");
                    double harga = input.nextDouble();

                    System.out.println("Pilih tipe produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");
                    System.out.print("Pilih (1-3): ");
                    int tipe = input.nextInt();

                    if (tipe == 1) {
                        System.out.print("Masukkan ukuran layar: ");
                        double layar = input.nextDouble();

                        System.out.print("Masukkan kapasitas penyimpanan: ");
                        int storage = input.nextInt();

                        daftarProduk.add(new Smartphone(merk, seri, harga, layar, storage));

                    } else if (tipe == 2) {
                        System.out.print("Masukkan RAM: ");
                        int ram = input.nextInt();
                        input.nextLine();

                        System.out.print("Masukkan jenis processor: ");
                        String processor = input.nextLine();

                        daftarProduk.add(new Laptop(merk, seri, harga, ram, processor));

                    } else if (tipe == 3) {
                        System.out.print("Masukkan resolusi: ");
                        int resolusi = input.nextInt();
                        input.nextLine();

                        System.out.print("Masukkan jenis lensa: ");
                        String lensa = input.nextLine();

                        daftarProduk.add(new Camera(merk, seri, harga, resolusi, lensa));
                    }

                    break;

                case 2:
                    if (daftarProduk.isEmpty()) {
                        System.out.println("Belum ada produk.");
                    } else {
                        System.out.println("\nDaftar Produk:");
                        for (Product p : daftarProduk) {
                            p.tampilkanInfo();
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor seri produk: ");
                    int cari = input.nextInt();

                    boolean ditemukan = false;

                    for (Product p : daftarProduk) {
                        if (p.getnomorSeri() == cari) {
                            System.out.println("Anda membeli produk:");
                            p.tampilkanInfo();
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}