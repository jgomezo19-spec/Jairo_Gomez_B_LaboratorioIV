public class PagoEfectivo extends Pago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago en efectivo");
        System.out.println("Monto: Q" + monto);
    }
}