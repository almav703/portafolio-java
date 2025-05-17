// DialogoTexto.java
public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(String personaje, String dialogo) {
        System.out.println(personaje + ": \"" + dialogo + "\"");
    }
}
