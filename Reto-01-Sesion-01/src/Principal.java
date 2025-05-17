import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente();

        // Lee los datos e imprime
        System.out.print("Ingrese el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        paciente.edad = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Ingrese el número de expediente: ");
        paciente.expediente = scanner.nextLine();

        paciente.mostrarInformacion();  // Muestra información del paciente

        scanner.close();
    }
}
