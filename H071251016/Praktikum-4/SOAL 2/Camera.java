class Camera extends Product {
    int resolution;
    String lensType;

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}