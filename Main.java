import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> list=new ArrayList<>();
        list.add(new Laptop("HP", 8, 12500));
        list.add(new Laptop("DELL", 8, 10500));
        list.add(new Laptop("ASUS", 16, 25000));
        list.add(new Laptop("Lenovo", 16, 19500));
        list.add(new Laptop("APPLE", 16, 35600));
        
        System.out.println("Using Comparable");
        Collections.sort(list);
        for (Laptop l: list){
            System.out.println(l);
        }

        Comparator<Laptop> com =new Comparator<Laptop>() {

            @Override
            public int compare(Laptop l1, Laptop l2) {
              if (l1.getPrice()>l2.getPrice())
                return 1;
                else if (l1.getPrice()==l2.getPrice())
                    return 0;
                    else {
                        return -1;
                    }
            }
            
        };
        System.out.println("Using Comparator");
        Collections.sort(list,com);
        for (Laptop l2:list){
            System.out.println(l2);
        }
     }
}
