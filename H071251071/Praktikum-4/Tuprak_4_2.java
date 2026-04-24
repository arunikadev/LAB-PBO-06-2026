import java.util.*;

class Product {
    String brand;
    int seriesNumber;
    double price;

    Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String b, int s, double p, double screen, int storage) {
        super(b, s, p);
        this.screenSize = screen;
        this.storageCapacity = storage;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String b, int s, double p, int ram, String proc) {
        super(b, s, p);
        this.ramSize = ram;
        this.processorType = proc;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String b, int s, double p, int res, String lens) {
        super(b, s, p);
        this.resolution = res;
        this.lensType = lens;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}

public class Tuprak_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> stok = new ArrayList<>();
        int menu = 0;

        while (menu != 4) {
            System.out.println("\nMenu:\n1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan nama produk: "); String b = sc.next();
                System.out.print("Masukkan nomor seri: "); int s = sc.nextInt();
                System.out.print("Masukkan harga: "); double p = sc.nextDouble();
                System.out.println("Pilih tipe produk:\n1. Smartphone\n2. Laptop\n3. Camera");
                int tipe = sc.nextInt();

                if (tipe == 1) {
                    System.out.print("Masukkan ukuran layar (inci): "); double screen = sc.nextDouble();
                    System.out.print("Masukkan kapasitas penyimpanan (GB): "); int store = sc.nextInt();
                    stok.add(new Smartphone(b, s, p, screen, store));
                } else if (tipe == 2) {
                    System.out.print("Masukkan ukuran RAM (GB): "); int ram = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Masukkan tipe prosesor: "); String proc = sc.nextLine();
                    stok.add(new Laptop(b, s, p, ram, proc));
                } else if (tipe == 3) {
                    System.out.print("Masukkan resolusi (MP): "); int res = sc.nextInt();
                    System.out.print("Masukkan tipe lensa: "); String lens = sc.next();
                    stok.add(new Camera(b, s, p, res, lens));
                }
            } else if (menu == 2) {
                System.out.println("Daftar Produk:");
                for (Product pr : stok) {
                    pr.displayInfo();
                    System.out.println("--------------------");
                }
            } else if (menu == 3) {
                System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                int cari = sc.nextInt();
                boolean ketemu = false;
                for (int i = 0; i < stok.size(); i++) {
                    if (stok.get(i).seriesNumber == cari) {
                        System.out.println("Anda telah membeli produk:");
                        stok.get(i).displayInfo();
                        stok.remove(i);
                        ketemu = true;
                        break;
                    }
                }
                if (!ketemu) System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
            }
        }
        System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
    }
}
