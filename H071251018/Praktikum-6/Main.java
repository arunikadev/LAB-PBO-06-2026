import java.util.Scanner;

// CLI Sistem Manajemen Perpustakaan
public class Main {

    static Library library = new Library();
    static Scanner sc      = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Sistem Manajemen Perpustakaan ===");

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Pilih menu: ");
            int choice = readInt();

            switch (choice) {
                case 1 -> tambahItem();
                case 2 -> tambahAnggota();
                case 3 -> pinjamItem();
                case 4 -> kembalikanItem();
                case 5 -> {
                    System.out.println("\n=== Status Perpustakaan ===");
                    System.out.println(library.getLibraryStatus());
                }
                case 6 -> {
                    System.out.println("\n=== Log Aktivitas ===");
                    System.out.println(library.getAllLogs());
                }
                case 7 -> lihatItemDipinjamAnggota();
                case 8 -> {
                    System.out.println("Sampai jumpa!");
                    running = false;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // ── Menu ──────────────────────────────────
    static void printMenu() {
        System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
        System.out.println("1. Tambah Item");
        System.out.println("2. Tambah Anggota");
        System.out.println("3. Pinjam Item");
        System.out.println("4. Kembalikan Item");
        System.out.println("5. Lihat Status Perpustakaan");
        System.out.println("6. Lihat Log Aktivitas");
        System.out.println("7. Lihat Item yang Dipinjam Anggota");
        System.out.println("8. Keluar");
    }

    // ── 1. Tambah Item ────────────────────────
    static void tambahItem() {
        System.out.print("Tipe item (1=Buku, 2=DVD): ");
        int tipe = readInt();
        System.out.print("ID Item: ");
        int id = readInt();
        System.out.print("Judul: ");
        String judul = sc.nextLine().trim();

        try {
            if (tipe == 1) {
                System.out.print("Penulis: ");
                String author = sc.nextLine().trim();
                Book book = new Book(judul, id, author);
                System.out.println(library.addItem(book));
            } else if (tipe == 2) {
                System.out.print("Durasi (menit): ");
                int durasi = readInt();
                DVD dvd = new DVD(judul, id, durasi);
                System.out.println(library.addItem(dvd));
            } else {
                System.out.println("Tipe tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ── 2. Tambah Anggota ─────────────────────
    static void tambahAnggota() {
        System.out.print("ID Anggota: ");
        int id = readInt();
        System.out.print("Nama Anggota: ");
        String nama = sc.nextLine().trim();
        Member member = new Member(nama, id);
        System.out.println(library.addMember(member));
    }

    // ── 3. Pinjam Item ────────────────────────
    static void pinjamItem() {
        System.out.print("ID Anggota: ");
        int memberId = readInt();
        System.out.print("ID Item: ");
        int itemId = readInt();
        System.out.print("Jumlah hari pinjam: ");
        int days = readInt();

        try {
            System.out.println(library.borrowItem(memberId, itemId, days));
        } catch (Exception e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }

    // ── 4. Kembalikan Item ────────────────────
    static void kembalikanItem() {
        System.out.print("ID Anggota: ");
        int memberId = readInt();
        System.out.print("ID Item: ");
        int itemId = readInt();
        System.out.print("Keterlambatan (hari, 0 jika tepat waktu): ");
        int daysLate = readInt();

        try {
            System.out.println(library.returnItem(memberId, itemId, daysLate));
        } catch (Exception e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }

    // ── 7. Lihat Item Dipinjam Anggota ────────
    static void lihatItemDipinjamAnggota() {
        System.out.print("ID Anggota: ");
        int memberId = readInt();
        try {
            Member member = library.findMemberById(memberId);
            System.out.println("\nItem yang dipinjam oleh " + member.getName() + ":");
            member.getBorrowedItems();
        } catch (Exception e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }

    // ── Helper: baca integer ──────────────────
    // Baca int lalu buang newline sisa di buffer
    static int readInt() {
        int val = sc.nextInt();
        sc.nextLine(); // flush newline
        return val;
    }
}