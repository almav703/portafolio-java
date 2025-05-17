import java.util.concurrent.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlaneacionTemas {

    public static void main(String[] args) {
        // Lista segura de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // lista ordenada alfabéticamente
        System.out.println("Temas ordenados alfabéticamente:");
        List<Tema> temasOrdenadosAlfabeticamente = new ArrayList<>(temas);
        Collections.sort(temasOrdenadosAlfabeticamente);
        for (Tema tema : temasOrdenadosAlfabeticamente) {
            System.out.println("- " + tema);
        }

        // lista ordenada por prioridad
        System.out.println("\n⬆Temas ordenados por prioridad:");
        List<Tema> temasPorPrioridad = new ArrayList<>(temas);
        temasPorPrioridad.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema tema : temasPorPrioridad) {
            System.out.println("- " + tema);
        }

        // Mostrar recursos compartidos
        System.out.println("\nRecursos compartidos:");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}
