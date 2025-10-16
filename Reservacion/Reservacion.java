package Reservacion;

import Huesped.Huesped;
import Habitacion.Habitacion;

public class Reservacion {
    private int idReservacion;
    private Huesped huesped;
    private Habitacion habitacion;
    private int noches;

    public Reservacion(Huesped huesped, Habitacion habitacion, int noches){
        this.idReservacion = 0;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.noches = noches;
    }

    public double CalcularCostoFinal(){
        return this.habitacion.calcularCostoTotal() * this.noches;
    }

    public void mostrarTicketReservacion(){
        System.out.println("----- Ticket de Reservación -----");
        System.out.println("ID de Reservación: " + this.idReservacion);
        System.out.println("Huésped: " + this.huesped.getNombre());
        System.out.println("Email del Huésped: " + this.huesped.getEmail());
        System.out.println("País de Origen: " + this.huesped.getPais());
        System.out.println("Habitación Número: " + this.habitacion.getNumero());
        System.out.println("Tipo de Habitación: " + this.habitacion.getTipo());
        System.out.println("Noches: " + this.noches);
        System.out.println("Costo Total: $" + CalcularCostoFinal());
        System.out.println("---------------------------------");
    }

   


}
