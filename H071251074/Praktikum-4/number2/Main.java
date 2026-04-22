package number2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            String pilihan = input.nextLine();

            if (pilihan.equals("4")) {
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                break;
            }

            switch (pilihan) {
                case "1":
                    System.out.print("\nMasukkan nama brand: ");
                    String brand = input.nextLine();
                    System.out.print("Masukkan nomor seri: ");
                    int sn = input.nextInt();
                    System.out.print("Masukkan harga: ");
                    double price = input.nextDouble();
                    input.nextLine();

                    System.out.println("\nTipe produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");
                    System.out.print("Pilih tipe produk (1-3): ");
                    String jenis = input.nextLine();

                    if (jenis.equals("1")) {
                        System.out.print("\nMasukkan ukuran layar (inci): ");
                        double ss = input.nextDouble();
                        System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                        int st = input.nextInt();
                        input.nextLine();
                        

                        list.add(new Smartphone(brand, sn, price, ss, st));

                    }else if (jenis.equals("2")) {
                        System.out.print("\nMasukkan RAM (GB): ");
                        int ram = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan tipe processor: ");
                        String proc = input.nextLine();

                        list.add(new Laptop(brand, sn, price, ram, proc));

                    }else if (jenis.equals("3")) {
                        System.out.println("\nMasukkan resolusi kamera (MP)");
                        int res = input.nextInt();
                        input.nextLine();
                        System.out.println("Masukkan tipe lensa: ");
                        String lt = input.nextLine();

                        list.add(new Camera(brand, sn, price, res, lt));

                    }else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;
                
                case "2":
                    System.out.println("\nDaftar Produk:");
                    for (Product p : list) {
                        p.displayInfo();
                        System.out.println("");
                    }
                    break;

                case "3":
                    System.out.print("Masukkan Serial Number: ");
                    int cari = input.nextInt();
                    input.nextLine();

                    boolean found = false;
                    for (Product p : list) {
                        if (p.seriesNumber == cari) {
                            System.out.println("Anda telah membeli produk:");
                            p.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Produk tidak ditemukan!");
                    }
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
                }
            }input.close();
        }
}