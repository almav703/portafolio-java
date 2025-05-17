public class Principal {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar con objeto pasajero
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A1234567");
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("Reserva realizada con éxito.");
        }

        // Mostrar itinerario
        System.out.println("\nItinerario del vuelo:");
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("\nCancelando reserva...");
        vuelo.cancelarReserva();

        // Mostrar itinerario sin reserva
        System.out.println("\nItinerario del vuelo:");
        System.out.println(vuelo.obtenerItinerario());

        // Reservar con nombre y pasaporte
        if (vuelo.reservarAsiento("Alma Valeria", "B2345678")) {
            System.out.println("\nNueva reserva realizada con éxito.");
        }

        // Mostrar itinerario actualizado
        System.out.println("\nItinerario del vuelo:");
        System.out.println(vuelo.obtenerItinerario());
    }
}
