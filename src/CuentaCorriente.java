public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;
    public CuentaCorriente(String numero, double saldo, String titular, double limite) {
        super(numero, saldo, titular); limiteSobregiro = limite;
    }
    @Override
    public boolean extraer(double monto) {
        if (monto > 0 && monto <= saldo + limiteSobregiro) { saldo -= monto; return true; }
        return false;
    }
}