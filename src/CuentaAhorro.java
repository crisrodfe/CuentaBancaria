
/**
 *
 * @author CrisRodFe
 */
public class CuentaAhorro extends CuentaBancaria{
    protected float tipoInteres;


    public CuentaAhorro(){        
    }
    /**
     * Constructor
     * @param titularCuenta
     * @param saldo
     * @param numeroCuenta
     * @param tipoInteres 
     */
    public CuentaAhorro(Persona titularCuenta,float saldo,String numeroCuenta, float tipoInteres){
        super(titularCuenta,saldo,numeroCuenta);
        this.tipoInteres=tipoInteres;
    }
    /**
     * 
     * @return tipoInteres
     */
    public float getTipoInteres() {
        return tipoInteres;
    }

    /**
     * 
     * @param tipoInteres 
     */
    public void setTipoInteres(float tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    
}
