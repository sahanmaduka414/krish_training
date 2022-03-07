public class Builder {

    public static void main(String[] args) {
        Smartphone.Samsung s = new Smartphone.Samsung();
        s.setBrand("Samsung").setModel("J7").setCamera(8).setDisplay_size(7).setNFC(true).setRam(8).setStorage(60).setPrice(100000);
        Smartphone build = s.build();
        System.out.println(build);
        System.out.println("");
        Smartphone.Samsung n = new Smartphone.Samsung();
        n.setBrand("Saamsung").setModel("J9").setCamera(4).setDisplay_size(5).setNFC(true).setRam(4).setStorage(42).setPrice(50000);
        Smartphone build1 = n.build();
        System.out.println(build1);

    }

}

class Smartphone {

    private String brand;
    private String model;
    private int camera;
    private boolean NFC;
    private double display_size;
    private int storage;
    private double price;
    private int ram;

    public Smartphone(Samsung s) {
        this.brand = s.brand;
        this.model = s.model;
        this.camera = s.camera;
        this.NFC = s.NFC;
        this.display_size = s.display_size;
        this.storage = s.storage;
        this.price = s.price;
        this.ram = s.ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCamera() {
        return camera;
    }

    public boolean isNFC() {
        return NFC;
    }

    public double getDisplay_size() {
        return display_size;
    }

    public int getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        String f = this.getBrand();

        return "Model :"+getModel() + "\n" +"Brand :"+ getBrand() + "\n" +"Camera :"+ getCamera() + "\n" +"Display :"+ getDisplay_size() + "\n" +"Price :"+ getPrice() + "\n" +"Ram :"+ getRam() + "\n" +"Storage :"+ getStorage();
    }

    static class Samsung {

        private String brand;
        private String model;
        private int camera;
        private boolean NFC;
        private double display_size;
        private int storage;
        private double price;
        private int ram;

        public Smartphone build() {
            Smartphone n = new Smartphone(this);
            return n;
        }

        public Samsung setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Samsung setModel(String model) {
            this.model = model;
            return this;
        }

        public Samsung setCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public Samsung setNFC(boolean NFC) {
            this.NFC = NFC;
            return this;
        }

        public Samsung setDisplay_size(double display_size) {
            this.display_size = display_size;
            return this;
        }

        public Samsung setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Samsung setPrice(double price) {
            this.price = price;
            return this;
        }

        public Samsung setRam(int ram) {
            this.ram = ram;
            return this;
        }

    }
}
