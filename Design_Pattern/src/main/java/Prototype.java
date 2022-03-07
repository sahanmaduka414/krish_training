public class Prototype {
    public static void main(String[] args) {

        Car c = new Car("Blue", "Audi", "A8", "Two-Stroke Engine" , "Hatchback", "Diesel", 1500000, "2021-02-15");
        Car c1 = c.clone();
        System.out.println(c1);
        c1.setEnginetype("Six-Stroke Engine");
        c1.setBodytype("Roadster");
        c1.setFueltype("Petrol");
        Car clone = c1.clone();
        System.out.println(clone);

    }
}
interface CarPrototype {

    public abstract Car clone();

}

class Car implements CarPrototype {


    private String color;
    private String brand;
    private String model;
    private String enginetype;
    private String bodytype;
    private String fueltype;
    private double price;
    private String year;

    public Car(String color, String brand, String model, String enginetype, String bodytype, String fueltype, double price, String year) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.enginetype = enginetype;
        this.bodytype = bodytype;
        this.fueltype = fueltype;
        this.price = price;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }


    public String getFueltype() {
        return fueltype;
    }


    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    @Override
    public Car clone() {
        //aluthin hadana object ekata set kranne currently run wena object eke values
        return new Car(this.color, this.brand,this.model,this.enginetype,this.bodytype,this.fueltype,this.price,this.year);
    }

    @Override
    public String toString() {
        return this.color+","+this.brand+","+this.model+","+this.enginetype+","+this.bodytype+","+this.fueltype+","+this.price+","+this.year;
    }
}
