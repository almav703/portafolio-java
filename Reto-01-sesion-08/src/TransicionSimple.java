// TransicionSimple.java
public class TransicionSimple implements TransicionHistoria {
    public void cambiarEscena(String nuevaEscena) {
        System.out.println("Transición a la escena: " + nuevaEscena);
    }
}
