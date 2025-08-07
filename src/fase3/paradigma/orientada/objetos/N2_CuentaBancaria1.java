package fase3.paradigma.orientada.objetos;

public class N2_CuentaBancaria1 {
    public static void main(String[] args) {
            N2_CuentaBancaria cuenta = new N2_CuentaBancaria(1000.0, 500.0, "Oscar Letelier");

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo Inicial: $" + cuenta.getSaldo());

        cuenta.depositar(250);
        cuenta.retirar(300);
        cuenta.retirar(2000); // Intento Fallido

        System.out.println("Saldo Final: $" + cuenta.getSaldo());
    }
}
