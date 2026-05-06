import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String borrow(LibraryItem item, int days) {
        if (item.isBorrowed()) {
            throw new IllegalStateException(
                    "Item " + item.getTitle() + " tidak tersedia (sudah dipinjam).");
        }
        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        item.returnItem();
        borrowedItems.remove(item);
        double fine = item.calculateFine(daysLate);

        long fineAmount = (long) fine;
        return "Item " + item.getTitle() +
                " berhasil dikembalikan dengan denda: Rp " + fineAmount;
    }

    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam");
        } else {
            System.out.println("+------+--------------------+");
            System.out.println("| ID   | Judul              |");
            System.out.println("+------+--------------------+");
            for (LibraryItem item : borrowedItems) {
                System.out.printf("| %-4d | %-18s |%n",
                        item.getItemId(), item.getTitle());
            }
            System.out.println("+------+--------------------+");
        }
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public List<LibraryItem> getBorrowedList() {
        return borrowedItems;
    }
}