import Habitacion.Habitacion;
import Huesped.Huesped;
import Reservacion.Reservacion;
import ServicioExtra.ServicioExtra;
public class hotel {
    public static void main(String[] args) {
        // Crear servicios extras
        ServicioExtra servicio1 = new ServicioExtra("Desayuno", 300.0);
        ServicioExtra servicio2 = new ServicioExtra("WiFi", 150.0);
        
        Habitacion habitacion = new Habitacion(505, "Suite", 5000);
        habitacion.agregarServicio(servicio1);
        habitacion.agregarServicio(servicio2);

        Huesped huesped = new Huesped( "Sofia", "sofisnice@gmail.com", "Mexico");
        
        Reservacion reservacion = new Reservacion(huesped, habitacion, 4);
        reservacion.mostrarTicketReservacion();
    }

}
