import java.util.Comparator;
import java.util.Objects;

public class Playeras extends Productos implements Comparable<Playeras>{
    Size size;

    public Playeras(int cantidad, String marca, double precio, String color) {
        super(cantidad, marca, precio, color);
    }

    public Playeras(int cantidad, String marca, double precio, String color, Size size) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof  Playeras)){
            return false;
        }
        Playeras playeras = (Playeras) o;
        return super.getCantidad()==playeras.getCantidad()
                && super.getMarca()==playeras.getMarca()
                && super.getPrecio()==playeras.getPrecio()
                && super.getColor()==playeras.getColor()
                && size == playeras.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCantidad(),getMarca(),getPrecio(),getColor(),getSize());
    }

    @Override
    public int compareTo(Playeras playeras) {
        return (int) Math.round(super.getPrecio()-playeras.getPrecio());
    }
    public static Comparator<Playeras> cantidadComparator=new Comparator<Playeras>() {
        @Override
        public int compare(Playeras p1, Playeras p2) {
            return p1.getCantidad()-p2.getCantidad();
        }
    };
    public static Comparator<Playeras> marcaComparator=new Comparator<Playeras>() {
        @Override
        public int compare(Playeras p1, Playeras p2) {
            return p1.getMarca().compareToIgnoreCase(p2.getMarca());
        }
    };

}
