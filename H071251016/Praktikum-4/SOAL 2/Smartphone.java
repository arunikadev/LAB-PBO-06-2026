class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage: " + storageCapacity + "GB");
    }
}