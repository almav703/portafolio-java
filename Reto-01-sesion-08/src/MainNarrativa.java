// MainNarrativa.java
public class MainNarrativa {
    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo("Narrador", "Te encuentras en un bosque oscuro.");
        boolean continuar = decision.tomarDecision("¿Quieres seguir adelante?");

        if (continuar) {
            transicion.cambiarEscena("Cueva misteriosa");
            dialogo.mostrarDialogo("Guía", "Has llegado a una cueva con secretos.");
        } else {
            transicion.cambiarEscena("Regreso al pueblo");
            dialogo.mostrarDialogo("Narrador", "Decidiste regresar a casa sano y salvo.");
        }
    }
}
