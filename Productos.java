public class Productos {

    private int cantidad;
    private String marca;
    private double precio;
    private String color;

    public Productos(int cantidad, String marca, double precio, String color) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return
                "cantidad=" + cantidad +
                ", marca='" + marca +
                ", precio=" + precio +
                ", color='" + color;
    }

}

