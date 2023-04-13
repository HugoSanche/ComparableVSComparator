public class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " brand='" + getBrand() + "'" +
            ", ram='" + getRam() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

    @Override
    public int compareTo(Laptop laptop2) {
  
        if (this.getBrand().compareTo(laptop2.getBrand())>1){
            return 1;
        }
        else if (this.getBrand().compareTo(laptop2.getBrand())==0){
            return 0;
        }
        else {
            return -1;
        }
    }
     
}