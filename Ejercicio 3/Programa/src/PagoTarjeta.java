public class PagoTarjeta extends Pago {

    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con tarjeta");
        System.out.println("Monto: Q" + monto);
        System.out.println("Tarjeta: " + numeroTarjeta);
    }
}