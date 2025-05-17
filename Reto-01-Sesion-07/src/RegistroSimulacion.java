import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config/parametros.txt");
        guardarParametros(rutaArchivo);
        leerParametros(rutaArchivo);
    }

    public static void guardarParametros(Path ruta) {
        try {
            // Crear carpeta si no existe
            if (!Files.exists(ruta.getParent())) {
                Files.createDirectories(ruta.getParent());
            }

            // Contenido del archivo
            String contenido = "Tiempo de ciclo: 55.8 segundos\n"
                    + "Velocidad de línea: 1.2 m/s\n"
                    + "Número de estaciones: 8";

            // Escribir archivo
            Files.write(ruta, contenido.getBytes());

            // Confirmar que el archivo fue creado
            if (Files.exists(ruta)) {
                System.out.println("Archivo creado exitosamente en: " + ruta);
            }

        } catch (IOException e) {
            System.out.println("Error al guardar los parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros(Path ruta) {
        try {
            String contenido = Files.readString(ruta);
            System.out.println("\nContenido del archivo:\n" + contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
