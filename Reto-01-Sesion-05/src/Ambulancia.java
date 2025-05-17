public class Ambulancia extends UnidadEmergencia {
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String nombre, SistemaGPS gps, Sirena sirena, Operador operador) {
        super(nombre);
        this.gps = gps;
        this.sirena = sirena;
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
