
import java.util.Hashtable;



/**
 *
 * @author CrisRodFe
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    protected float comMantenimiento;
    /**
     * 
     * @param titularCuenta
     * @param saldo
     * @param numeroCuenta
     * @param entidad
     * @param comMantenimiento 
     */    
    public CuentaCorrientePersonal(Persona titularCuenta,float saldo,String numeroCuenta,Hashtable entidad,float comMantenimiento){
        super(titularCuenta,saldo,numeroCuenta,entidad);//llamada al constructor de la clase de la que hereda
        this.comMantenimiento=comMantenimiento;
    }
    
    public CuentaCorrientePersonal(){
        super();
    }

    /**
     * @return the comMantenimiento
     */
    public float getComMantenimiento() {
        return comMantenimiento;
    }

    /**
     * @param comMantenimiento the comMantenimiento to set
     */
    public void setComMantenimiento(float comMantenimiento) {
        this.comMantenimiento = comMantenimiento;
    }
}
