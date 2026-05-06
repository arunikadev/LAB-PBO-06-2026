package nomor02;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<tipe> listProduk = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\nMenu:\n1. Tambah Produk\n2. Tampilkan\n3. Beli\n4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            pilihan = sc.nextInt();

switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    sc.nextLine();
                    String brand = sc.nextLine();
                    System.out.print("Masukkan nomor seri: ");
                    int sn = sc.nextInt();
                    System.out.print("Masukkan harga: ");
                    double price = sc.nextDouble();
                    System.out.println("1. Smartphone \n2. Laptop \n3. Camera ");
                    System.out.print("Pilih tipe produk (1-3): ");
                    int jenis = sc.nextInt();
                    switch (jenis) {
                        case 1:
                            System.out.print("Masukkan ukuran layar (inches): ");
                            double screenSize = sc.nextDouble();
                            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                            int storage = sc.nextInt();
                            listProduk.add(new prodak(brand, sn, price, screenSize, storage));
                            break;
                        case 2:
                            System.out.print("Masukkan ukuran RAM (GB): ");
                            int ram = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Masukkan tipe processor: ");
                            String proc = sc.nextLine();
                            listProduk.add(new Laptop(brand, sn, price, ram, proc));
                            break;
                        case 3:
                            System.out.print("Masukkan resolusi kamera (MP): ");
                            int res = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Masukkan tipe lensa: ");
                            String lens = sc.nextLine();
                            listProduk.add(new Camera(brand, sn, price, res, lens));
                            break;
                        default:
                            System.out.println("Tipe produk tidak valid!");
                        break;
                    }break;

                case 2:
                    for (tipe p : listProduk) {
                        p.displayInfo();
                        System.out.println("-----------------");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    int cari = sc.nextInt();
                    boolean ditemukan = false;
                    for (tipe p : listProduk) {
                        if (p.seriesNumber == cari) {
                            System.out.println("Anda telah membeli produk:");
                            p.displayInfo();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
                    }
                    break;
                
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }        } while (pilihan != 4);
    }
}