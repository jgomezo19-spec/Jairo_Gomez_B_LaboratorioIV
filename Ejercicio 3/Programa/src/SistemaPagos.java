public class SistemaPagos {

    public static void main(String[] args) {

        Pago pago1 = new PagoTarjeta(250.50, "1234-5678");
        Pago pago2 = new PagoEfectivo(100);

        pago1.procesarPago();

        System.out.println();

        pago2.procesarPago();
    }
}