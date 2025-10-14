package ServicioExtra;

public class ServicioExtra {
    //Atributos
    private String nombre;
    private double precio;

    //Constructor
    public ServicioExtra(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Encapsulamiento
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
    
}
