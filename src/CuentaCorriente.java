
import java.util.Hashtable;



/**
 *
 * @author CrisRodFe
 */
public class CuentaCorriente extends CuentaBancaria{
    Hashtable entidad;

    /**
     * 
     * @param titularCuenta
     * @param saldo
     * @param numeroCuenta
     * @param entidad 
     */
    public CuentaCorriente(Persona titularCuenta,float saldo,String numeroCuenta, Hashtable entidad){
       super(titularCuenta,saldo,numeroCuenta); //LLamada al constructor de la clase de la que hereda.
       this.entidad=entidad;
    }

    public CuentaCorriente(){        
    }
    /**
     * 
     * @return entidad
     */
    public Hashtable getEntidad() {
        return entidad;
    }

    /**
     * 
     * @param entidad 
     */
    public void setEntidad(Hashtable entidad) {
        this.entidad = entidad;
    }


}
