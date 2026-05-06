package nomor01;

public class classes {
    // Bangun Datar
    public static class Lingkaran {
        public int jarijari;
        public double luas() { return 3.14 * jarijari * jarijari; }
        public double keliling() { return 2 * 3.14 * jarijari; }
    }

    public static class Persegi {
        public int sisi;
        public double luas() { return sisi * sisi; }
        public double keliling() { return sisi * 4; }
    }

    public static class PersegiPanjang {
        public int panjang, lebar;
        public double luas() { return panjang * lebar; }
        public double keliling() { return 2 * (panjang + lebar); }
    }

    public static class Trapesium {
        public int s1, s2, s3, s4, tinggi;
        public double luas() { return ((double)(s1 + s2) / 2) * tinggi; }
        public double keliling() { return s1 + s2 + s3 + s4; }
    }

    // Bangun Ruang
    public static class balok extends PersegiPanjang {
        public int tinggi;
        public double luas() { return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi); }
        public double volume() { return panjang * lebar * tinggi; }
    }

    public static class Kubus extends Persegi {
        public double luas() { return 6 * super.luas(); } // Luas Permukaan
        public double volume() { return sisi * sisi * sisi; }
    }

    public static class Bola extends Lingkaran {
        public double luas() { return 4 * super.luas(); }
        public double volume() { return (4.0/3.0) * 3.14 * Math.pow(jarijari, 3); }
    }

    public static class Tabung extends Lingkaran {
        public int tinggi;
        public double luas() { return 2 * super.luas() + super.keliling() * tinggi; }
        public double volume() { return super.luas() * tinggi; }
    }
}