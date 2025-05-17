import java.util.Scanner;
public class Paciente {
   String nombre;
   int edad;
   String expediente;

public void mostrarInformacion() {
        System.out.println("paciente; " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
