
package clasesobjectos;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jose Jorge
 */
public class ClasesObjectos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente("123456", "Juan Pérez", 5000.0, 1000.0);
        cuentaCorriente.mostrarInformacion();
        
        // Cuenta de Ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro("789012", "María López", 3000.0, 2.5);
        cuentaAhorro.aplicarInteres();
        cuentaAhorro.mostrarInformacion();
        
        // Cuenta a Plazo Fijo
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 15); // Establecer una fecha de apertura
        Date fechaApertura = cal.getTime();
        
        CuentaPlazoFijo cuentaPlazoFijo = new CuentaPlazoFijo("345678", "Ana Gómez", 10000.0, 12, fechaApertura);
        cuentaPlazoFijo.mostrarInformacion();
    }
    
}
