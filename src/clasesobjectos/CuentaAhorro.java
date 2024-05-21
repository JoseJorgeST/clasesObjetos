
package clasesobjectos;

/**
 *
 * @author Jose Jorge
 */

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;
    
    public CuentaAhorro(String numeroCuenta, String titular, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres() {
        double interes = saldo * tasaInteres / 100;
        saldo += interes;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Cuenta de Ahorro:");
        super.mostrarInformacion();
        System.out.println("Tasa de Interés: " + tasaInteres + "%");
    }
}

    
    

