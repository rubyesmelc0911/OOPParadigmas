package Huesped;

public class Huesped {
    //atributos
    private String nombre;
    private String email;
    private String paisOrigen;


    //constructor
    public Huesped(String nombre, String email, String paisOrigen){
        this.nombre = nombre;
        this.email = email;
        this.paisOrigen = paisOrigen;
    }

    //Encapsulamiento
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPaisOrigen(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPais(){
        return this.paisOrigen;
    }

    //Metodo
    public void mostrarHuesped(){
        System.out.println("Nombre: "+ this.nombre );
        System.out.println("Email: "+ this.email);
        System.out.println("Pais de Origen: "+ this.paisOrigen);
    }

    

}
