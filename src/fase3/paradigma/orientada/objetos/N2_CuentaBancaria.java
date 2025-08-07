package fase3.paradigma.orientada.objetos;

/*
Objetivo: Aplicar encapsulamiento (private) para proteger datos internos
y exponerlos controladamente (public getters/setters).

Crea una clase CuentaBancaria, (private double saldo, private String titular,
). Metodos public depositar(), public retirar() (validando fondos), public getSaldo(),
public getTitular(). No permitas setSaldo() directo

Conceptos Reforzados: private, public, getters, setters controlado, encapsulamiento.
 */

public class N2_CuentaBancaria {
    // Atributos
    private double saldo;
    private double salario;
    private String titular;

    //Constructor
    public N2_CuentaBancaria(double saldo, double salario, String titular){
        this.saldo = saldo;
        this.salario = salario;
        this.titular = titular;
    }

    // Metodos para depositar dinero
    public void depositar(double cantidad){
        if(cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad);
        } else {
            System.out.println("Cantidad invalida para depositar.");
        }
    }

    // Metodo para retirar dinero (con validacion de fondos)
    public void retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida");
        }
    }

    // Getter para obtener el saldo
    public double getSaldo(){
        return saldo;
    }

    //Getter para obtener el titular
    public String getTitular(){
        return titular;
    }

    // Setter opcional para salario (si se desea modificar)
    public void setSalario(double salario){
        this.salario = salario;
    }

    //Getter para Salario
    public double getSalario() {
        return salario;
    }


}
