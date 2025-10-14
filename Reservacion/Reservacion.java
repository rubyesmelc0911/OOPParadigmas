package Reservacion;

import Huesped.Huesped;
import Habitacion.Habitacion;

public class Reservacion {
    private int idReservacion;
    private Huesped huesped;
    private Habitacion habitacion;
    private int noches;

    public Reservacion(Huesped huesped, Habitacion habitacion, int noches){
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.noches = noches;
    }

   


}
