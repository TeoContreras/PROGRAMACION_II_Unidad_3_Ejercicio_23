public class CuentaBancaria {
    protected String numeroCuenta, titular;
    protected double saldo;
    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta; this.saldo = saldo; this.titular = titular;
    }
    public void depositar(double monto) { if (monto > 0) saldo += monto; }
    public boolean extraer(double monto) {
        if (monto > 0 && monto <= saldo) { saldo -= monto; return true; }
        return false;
    }
    public void mostrarSaldo() { System.out.println(numeroCuenta + " - " + titular + " - Saldo: $" + saldo); }
}