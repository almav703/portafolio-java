public class CentralEmergencias {
    public static void main(String[] args) {
        // Creación de instancias
        SistemaGPS gps = new SistemaGPS();
        Sirena sirena = new Sirena();
        Operador operador1 = new Operador("Juan");
        Operador operador2 = new Operador("Laura");
        Operador operador3 = new Operador("Marco");

        Ambulancia ambulancia = new Ambulancia("Ambulancia", gps, sirena, operador1);
        Patrulla patrulla = new Patrulla("Patrulla", gps, sirena, operador2);
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de Bomberos", gps, sirena, operador3);

        // Llamadas a iniciar operaciones
        System.out.println();
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}
