package number2;

public class Product {
    String brand;
    Integer seriesNumber;
    double price;

    Product() {
        this.brand = "Kosong";
        this.seriesNumber = 000000;
        this.price = 0;
    }

    Product(String brand, Integer seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Serial number: " + this.seriesNumber);
        System.out.println("Price: $" + this.price);
    }
}