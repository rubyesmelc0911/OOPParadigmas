package Habitacion;

import ServicioExtra.ServicioExtra;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precioBase;
    private ServicioExtra[] serviciosContratados;
    private int contador;
    private double costoServicios;
    
    public Habitacion(){   
        this.numero = 0;
        this.tipo = "";
        this.precioBase = 0.0;
        this.serviciosContratados = new ServicioExtra[10]; // Capacidad para 10 servicios extras
        this.contador = 0;
        this.costoServicios = 0.0;
    }

    public Habitacion(int numero, String tipo, double precioBase, ServicioExtra[] serviciosContratados) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.serviciosContratados = serviciosContratados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public ServicioExtra[] getServiciosContratados() {
        return serviciosContratados;
    }
    public void setServiciosContratados(ServicioExtra[] serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }

    public void  agregarServicio(ServicioExtra servicio){
        this.serviciosContratados[contador] = servicio;
        contador++;

    }

    public double calcularCostoTotal(){
        for(int i=0; i<10; i++){
            if(this.serviciosContratados[i] != null){
                this.costoServicios += this.serviciosContratados[i].getPrecio();
            }
        }
        return this.precioBase + this.costoServicios;
    }

    
    public void mostrarHabitacion(){

        System.out.println("Numero de habitacion: "+this.numero);
        System.out.println("Tipo de habitacion: "+this.tipo);
        System.out.println("Precio base: "+this.precioBase);
        System.out.println("Servicios contratados: "+this.contador);

    }

}
