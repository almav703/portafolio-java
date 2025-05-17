public class PagoTransferencia extends MetodoPago {
    private boolean conexionExitosa;

    public PagoTransferencia(double monto, boolean conexionExitosa) {
        super(monto);
        this.conexionExitosa = conexionExitosa;
    }

    @Override
    public boolean autenticar() {
        return conexionExitosa;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
}
