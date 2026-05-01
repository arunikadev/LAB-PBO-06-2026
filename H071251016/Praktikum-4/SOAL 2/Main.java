import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> produkList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilih = sc.nextInt();

            switch(pilih){
                case 1: tambahProduk(); break;
                case 2: tampilProduk(); break;
                case 3: beliProduk(); break;
                case 4: System.out.println("Keluar..."); break;
                default: System.out.println("Pilihan tidak valid");
            }

        } while(pilih != 4);
    }

    
    static void tambahProduk(){
        sc.nextLine();
        System.out.print("Masukkan nama produk: ");
        String brand = sc.nextLine();

        System.out.print("Masukkan nomor seri: ");
        int serial = sc.nextInt();

        System.out.print("Masukkan harga: ");
        double price = sc.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = sc.nextInt();
        

        if(tipe == 1){
            Smartphone s = new Smartphone();
            s.brand = brand;
            s.serialNumber = serial;
            s.price = price;

            System.out.print("Ukuran layar (inci): ");
            s.screenSize = sc.nextDouble();

            System.out.print("Kapasitas penyimpanan (GB): ");
            s.storageCapacity = sc.nextInt();

            produkList.add(s);

        } else if(tipe == 2){
            Laptop l = new Laptop();
            l.brand = brand;
            l.serialNumber = serial;
            l.price = price;

            System.out.print("RAM: ");
            l.ramSize = sc.nextInt();
            sc.nextLine();

            System.out.print("Processor: ");
            l.processorType = sc.nextLine();

            produkList.add(l);

        } else if(tipe == 3){
            Camera c = new Camera();
            c.brand = brand;
            c.serialNumber = serial;
            c.price = price;

            System.out.print("Resolusi: ");
            c.resolution = sc.nextInt();
            sc.nextLine();

            System.out.print("Jenis lensa: ");
            c.lensType = sc.nextLine();

            produkList.add(c);
        }
    }

    
    static void tampilProduk(){
        if(produkList.isEmpty()){
            System.out.println("Belum ada produk.");
            return;
        }

        System.out.println("\nDaftar Produk:");
        for(Product p : produkList){
            p.displayInfo();
            System.out.println("---------------------");
        }
    }

    
    static void beliProduk(){
        System.out.print("Masukkan nomor seri produk: ");
        int cari = sc.nextInt();

        for(Product p : produkList){
            if(p.serialNumber == cari){
                System.out.println("Produk ditemukan:");
                p.displayInfo();
                System.out.println("Pembelian berhasil!");
                return;
            }
        }

        System.out.println("Produk tidak ditemukan.");
    }
}