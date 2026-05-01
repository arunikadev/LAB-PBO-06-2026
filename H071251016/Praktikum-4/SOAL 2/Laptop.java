class Laptop extends Product {
    int ramSize;
    String processorType;

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("RAM: " + ramSize + "GB");
        System.out.println("Processor: " + processorType);
    }
}