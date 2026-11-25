public class main {
    public static void main(String[] args) {
        CajaAhorro ahorro = new CajaAhorro("001", 100000, "Maria", 3);
        CuentaCorriente corriente = new CuentaCorriente("002", 50000, "Pedro", 20000);
        ahorro.depositar(10000); ahorro.aplicarIntereses(); ahorro.extraer(20000);
        corriente.extraer(60000);
        ahorro.mostrarSaldo(); corriente.mostrarSaldo();
    }
}