// MonitorCPU.java
import java.util.*;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> registros = new HashSet<>();

        try {
            System.out.println("Ingresa consumos de CPU (porcentaje), escribe -1 para salir:");

            while (true) {
                System.out.print(">> ");
                String entrada = scanner.nextLine();

                if (entrada.equals("-1")) break;

                int consumo;

                try {
                    consumo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println(" Error: Solo se permiten números enteros.");
                    continue;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("Error: El valor debe estar entre 0 y 100.");
                    continue;
                }

                if (!registros.add(consumo)) {
                    System.out.println("Valor duplicado: ya se ingresó " + consumo + "%.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("Alerta crítica: consumo de CPU " + consumo + "% supera el umbral.");
                }

                System.out.println("Registro aceptado: " + consumo + "%");
            }

        } catch (ConsumoCriticoException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Monitoreo finalizado.");
            scanner.close();
        }
    }
}
