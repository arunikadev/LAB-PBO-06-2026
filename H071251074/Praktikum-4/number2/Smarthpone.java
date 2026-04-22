package number2;

class Smartphone extends Product {
    double screenSize;
    Integer storageCapacity;

    Smartphone(String brand, Integer seriesNumber, double price, double screenSize, Integer storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + this.screenSize);
        System.out.println("Storage Capacity: " + this.storageCapacity);
    }
}