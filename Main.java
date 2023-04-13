import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> list=new ArrayList<>();
        list.add(new Laptop("HP", 8, 12500));
        list.add(new Laptop("DELL", 8, 10500));
        list.add(new Laptop("ASUS", 16, 25000));
        list.add(new Laptop("Lenovo", 16, 19500));
        list.add(new Laptop("APPLE", 16, 35600));
        Collections.sort(list);
        System.out.println("List of laptops "+list);
     }
}
