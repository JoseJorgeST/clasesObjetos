
package clasesobjectos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jose Jorge
 */
public class CuentaPlazoFijo extends CuentaBancaria{
    private int plazo; 
    private Date fechaApertura;
    
    public CuentaPlazoFijo(String numeroCuenta, String titular, double saldoInicial, int plazo, Date fechaApertura){
        super(numeroCuenta, titular, saldoInicial);
        this.plazo = plazo;
        this.fechaApertura = fechaApertura;
    }
    
     @Override
    public void retirar(double monto) {
        Date fechaActual = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaApertura);
        cal.add(Calendar.MONTH, plazo);
        Date fechaVencimiento = cal.getTime();

        if (fechaActual.after(fechaVencimiento)) {
            if (monto >= 10000 && monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso de " + monto + ". Saldo actual: " + saldo);
            } else {
                System.err.println("Saldo insuficiente o el monto a retirar debe ser mayor o igual a 10,000.");
            }
        } else {
            System.err.println("No se puede retirar hasta que el plazo haya vencido.");
        }
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Cuenta a Plazo Fijo:");
        super.mostrarInformacion();
        System.out.println("Plazo: " + plazo + " meses");
        System.out.println("Fecha de Apertura: " + fechaApertura);
    }
}

