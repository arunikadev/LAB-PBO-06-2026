package number2;

class Camera extends Product{
    Integer resolution;
    String lensType;
    
    Camera(String brand, Integer seriesNumber, double price, Integer resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Lens Type: " + this.lensType);
    }
}
