// Clase Principal
public class Principal {
    public static void main(String[] args) {
        // Crea una factura con RFC
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        System.out.println("Factura generada:\n" + facturaConRFC.getResumen());

        // Crea una factura sin RFC
        Factura facturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);
        System.out.println("\nFactura generada:\n" + facturaSinRFC.getResumen());
    }
}