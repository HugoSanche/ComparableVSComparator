import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_Productos {
    public static void main(String[] args) {
        List<Playeras> playeras=new ArrayList<>();
        playeras.add(new Playeras(5,"aeropostal",270.00,"Blanco",Size.LARGE));
        playeras.add(new Playeras(10,"versage",800.12,"azul",Size.MEDIUM));
        playeras.add(new Playeras(2,"tommy",2300.00,"azul",Size.SMALL));
        playeras.add(new Playeras(20,"ralft",900.00,"azul",Size.LARGE));
        playeras.add(new Playeras(8,"hugoBoss",1800.00,"azul",Size.EXTRA_LARGE));
        System.out.println(playeras);

        Collections.sort(playeras);
        System.out.println(playeras);
        Collections.sort(playeras,Playeras.cantidadComparator);
        System.out.println(playeras);

        Collections.sort(playeras,Playeras.marcaComparator);
        System.out.println(playeras);

        //Checking equals and hashcode
        Playeras p1=new Playeras(5,"aeropostal",270.00,"Blanco",Size.LARGE);
        Playeras p2=new Playeras(5,"aeropostal",270.00,"Blanco",Size.LARGE);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
    }
}
