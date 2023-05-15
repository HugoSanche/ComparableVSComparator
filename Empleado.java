public class Empleado implements Comparable {
    private Integer id;
    private String name;
    private int edad;

    public Empleado(Integer id, String name, int edad) {
        this.id = id;
        this.name = name;
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n"+id+" Nombre: "+name+", Edad: "+edad;
            
    }

    @Override
    public int compareTo(Object o) {
        Empleado emp=(Empleado)o;
        if(this.getId()>emp.getId()){
            return 1;
        }
        else if (this.getId()==emp.getId()){
            return 0;
        }
        else{
            return -1;
        }
    }
}
