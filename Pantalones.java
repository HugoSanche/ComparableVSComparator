public class Pantalones extends Productos {
    Size size;

    public Pantalones(int cantidad, String marca, double precio, String color) {
        super(cantidad, marca, precio, color);
    }

    public Pantalones(int cantidad, String marca, double precio, String color, Size size) {
        super(cantidad, marca, precio, color);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+
                "size=" + size +
                '}';
    }
}
