public class CajaAhorro extends CuentaBancaria {
    private double tasaInteres;
    public CajaAhorro(String numero, double saldo, String titular, double tasa) {
        super(numero, saldo, titular); tasaInteres = tasa;
    }
    public void aplicarIntereses() { if (tasaInteres > 0) saldo += saldo * tasaInteres / 100; }
}