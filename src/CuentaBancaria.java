
import java.io.Serializable;
/**
 *
 * @author CrisRodFe
 */
public class CuentaBancaria implements Serializable {
    protected Persona titularCuenta;
    protected float saldo;
    protected String numeroCuenta;

    public CuentaBancaria(){        
    }
    
    /**
     * Constructor
     * @param titularCuenta
     * @param saldo
     * @param numeroCuenta 
     */
    public CuentaBancaria(Persona titularCuenta,float saldo,String numeroCuenta){
        this.titularCuenta=titularCuenta;
        this.saldo=saldo;
        this.numeroCuenta=numeroCuenta;        
    }
    
    /**
     * Getters y Setters
     */
    /**
     * @return the titularCuenta
     */
    public Persona getTitularCuenta() {
        return titularCuenta;
    }
    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * @param titularCuenta the titularCuenta to set
     */
    public void setTitularCuenta(Persona titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }                                           
}
