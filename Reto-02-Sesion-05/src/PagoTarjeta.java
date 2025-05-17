public class PagoTarjeta extends MetodoPago {
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        if (saldoDisponible >= monto) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
        saldoDisponible -= monto;
    }
}
