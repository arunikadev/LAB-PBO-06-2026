import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> stok = new ArrayList<>();

        stok.add(new Smartphone("Samsung", 123456, 899.99, 6.5, 256));
        stok.add(new Laptop("Dell", 987654, 1299.99, 16, "Intel Core i7"));
        stok.add(new Camera("Canon", 456789, 699.99, 24, "Telephoto"));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Live");
            System.out.println("5. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan nama produk: ");
                String brand = sc.nextLine();
                System.out.print("Masukkan nomor seri: ");
                int seri = sc.nextInt();
                System.out.print("Masukkan harga: ");
                double harga = sc.nextDouble();
                sc.nextLine();

                System.out.println("Pilih tipe produk:");
                System.out.println("1. Smartphone\n2. Laptop\n3. Camera");
                System.out.print("Pilih tipe produk (1-3): ");
                int tipe = sc.nextInt();
                sc.nextLine();

                if (tipe == 1) {
                    System.out.print("Masukkan ukuran layar (inci): ");
                    double layar = sc.nextDouble();
                    System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                    int storage = sc.nextInt();
                    sc.nextLine();
                    stok.add(new Smartphone(brand, seri, harga, layar, storage));
                } else if (tipe == 2) {
                    System.out.print("Masukkan RAM (GB): ");
                    int ram = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan tipe prosesor: ");
                    String prosesor = sc.nextLine();
                    stok.add(new Laptop(brand, seri, harga, ram, prosesor));
                } else if (tipe == 3) {
                    System.out.print("Masukkan resolusi (MP): ");
                    int res = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan tipe lensa: ");
                    String lensa = sc.nextLine();
                    stok.add(new Camera(brand, seri, harga, res, lensa));
                }

            } else if (pilih == 2) {
                System.out.println("Daftar Produk:");
                for (Product p : stok) {
                    p.info();
                    System.out.println();
                }

            } else if (pilih == 3) {
                System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                int cari = sc.nextInt();
                sc.nextLine();
                boolean ditemukan = false;
                for (Product p : stok) {
                    if (p.seriesNumber == cari) {
                        System.out.println("Anda telah membeli produk:");
                        p.info();
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan)
                    System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");

            } else if (pilih == 5) {
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
    }
}
