// DecisionBinaria.java
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private Scanner scanner = new Scanner(System.in);

    public boolean tomarDecision(String pregunta) {
        System.out.println(pregunta + " (sí/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("sí");
    }
}
