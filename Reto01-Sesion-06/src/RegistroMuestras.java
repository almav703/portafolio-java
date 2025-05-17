import java.util.*;

public class RegistroMuestras {

    public static void main(String[] args) {
        // ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        // HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        // HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Mtra. Salas");

        // resultados
        System.out.println("Lista completa de muestras:");
        for (String especie : muestras) {
            System.out.println("- " + especie);
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\nRelación de ID → Investigador:");
        for (String id : idInvestigador.keySet()) {
            System.out.println(id + " → " + idInvestigador.get(id));
        }

        System.out.println("\nBúsqueda por ID 'M-002':");
        String investigador = idInvestigador.get("M-002");
        if (investigador != null) {
            System.out.println("Investigador responsable: " + investigador);
        } else {
            System.out.println("No se encontró ese ID.");
        }
    }
}
