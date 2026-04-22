package number2;

class Laptop extends Product {
    Integer ramSize;
    String processorType;

    Laptop(String brand, Integer seriesNumber, double price, Integer ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + this.ramSize);
        System.out.println("Processor Type: " + this.processorType);
    }
}