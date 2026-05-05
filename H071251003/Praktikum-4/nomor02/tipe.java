package nomor02;

public class tipe {
    public String brand;
    public int seriesNumber;
    public double price;
    public tipe(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: Rp." + price);
    }
}

class prodak extends tipe {
    public double screenSize;
    public int storageCapacity;
    public prodak(String b, int sn, double p, double ss, int sc) {
        super(b, sn, p);
        this.screenSize = ss;
        this.storageCapacity = sc;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}

class Laptop extends tipe {
    public int ramSize;
    public String processorType;
    public Laptop(String b, int sn, double p, int ram, String proc) {
        super(b, sn, p);
        this.ramSize = ram;
        this.processorType = proc;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

class Camera extends tipe {
    public int resolution;
    public String lensType;
    public Camera(String b, int sn, double p, int res, String lens) {
        super(b, sn, p);
        this.resolution = res;
        this.lensType = lens;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}
