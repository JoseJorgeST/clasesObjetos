
package clasesobjectos;

/**
 *
 * @author Jose Jorge
 */
public class CuentaCorriente extends CuentaBancaria{
    private double sobregiro;
    
    public CuentaCorriente( String numeroCuenta, String titular, double saldoInicial, double sobregiro){
        super(numeroCuenta, titular, saldoInicial);
        this.sobregiro = sobregiro;
    }
    
    @Override
    public void retirar(double monto){
        if (monto >= 10000) {
            if (monto <= saldo + sobregiro) {
                saldo -= monto;
                 System.out.println("Retiro exitoso de " + monto + ". Saldo actual: " + saldo);
            } else {
                System.err.println("El monto excede el saldo y el límite de sobregiro.");
            }
        } else {
            System.err.println("El monto debe ser mayor o igual a 10.000 pesos");
        }
    }
    
    
    public void mostrarInformacion() {
        System.out.println("Cuenta corriente");
        super.mostrarInformacion();
        System.out.println("Sobregiro permitido: " + sobregiro);
    }
    
    
}
