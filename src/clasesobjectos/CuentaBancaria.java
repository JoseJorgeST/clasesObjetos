/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesobjectos;

import java.lang.reflect.Constructor;

/**
 *
 * @author Jose Jorge
 */
public class CuentaBancaria {
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    
    public CuentaBancaria (String numeroCuenta, String titular, double saldoInicial){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto){
        if (monto >= 10000) {
            saldo += monto;
        } else {
            System.err.println("el monto a depositar debe ser mayor a 10.000 mil");
        }
    }
    
    public void retirar(double monto){
        if (monto >= 10000 && monto >= saldo) {
            saldo -= monto;
        } else {
            System.err.println("Saldo insuficiente, Recuerda que solo puede sacar mas de 10.000");
        }
    }
    
    public void mostrarInformacion(){
        
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
