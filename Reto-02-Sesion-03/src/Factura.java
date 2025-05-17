import java.util.Optional;

// Clase Factura
public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc == null) ? Optional.empty() : Optional.of(rfc);
    }

    public String getResumen() {
        String resumen = "Descripción: " + descripcion + "\nMonto: $" + monto + "\nRFC: ";
        return resumen + rfc.orElse("[No proporcionado]");
    }
}