import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example_Empleado {
    public static void main(String[] args) {
        List<Empleado> list=new ArrayList<>();
        list.add(new Empleado(1, "Pedro", 43));
        list.add(new Empleado(7, "Luis", 23));
        list.add(new Empleado(9, "Karina", 29));
        list.add(new Empleado(3, "Lionel", 37));
        list.add(new Empleado(11, "Veronica", 22));
        list.add(new Empleado(5, "Ulises", 28));
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Using Comparable");
        System.out.println(list);
        System.out.println("Using Comparator");
       
        Comparator<Empleado> com = new Comparator<Empleado>() {

            @Override
            public int compare(Empleado emp1, Empleado emp2) {
               if (emp1.getName().compareTo(emp2.getName())>1){
                return 1;
               }
               else if (emp1.getName().compareTo(emp2.getName())==0){
                return -1;
               }
               else{
                return 0;
               }
            }
            
        };
        Collections.sort(list, com);
        System.out.println(list);
    }
}
