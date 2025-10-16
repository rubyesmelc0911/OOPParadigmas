package Habitacion;

import ServicioExtra.ServicioExtra;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precioBase;
    private ServicioExtra[] serviciosContratados = new ServicioExtra[10];
    private int contador;
    private double costoServicios;
    

    public Habitacion(int numero, String tipo, double precioBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.contador = 0;
        this.costoServicios = 0.0;
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
