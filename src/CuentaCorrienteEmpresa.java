
import java.util.Hashtable;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CrisRodFe
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente{
    protected float intDes;
    protected float comDes;
    protected float maxDes;
    
    
    /**
     * Constructor
     * @param titularCuenta
     * @param saldo
     * @param numeroCuenta
     * @param entidad
     * @param intDes
     * @param comDes
     * @param maxDes 
     */
    public CuentaCorrienteEmpresa(Persona titularCuenta,float saldo,String numeroCuenta,Hashtable entidad,float intDes,float comDes,float maxDes){
        super(titularCuenta,saldo,numeroCuenta,entidad);//llamada al constructor de la clase de la que hereda
        this.intDes=intDes;
        this.comDes=comDes;
        this.maxDes=maxDes;                    
    }
    
    public CuentaCorrienteEmpresa(){
        super();
    }

    /**
     * @return the intDes
     */
    public float getIntDes() {
        return intDes;
    }

    /**
     * @return the comDes
     */
    public float getComDes() {
        return comDes;
    }

    /**
     * @return the maxDes
     */
    public float getMaxDes() {
        return maxDes;
    }

    /**
     * @param intDes the intDes to set
     */
    public void setIntDes(float intDes) {
        this.intDes = intDes;
    }

    /**
     * @param comDes the comDes to set
     */
    public void setComDes(float comDes) {
        this.comDes = comDes;
    }

    /**
     * @param maxDes the maxDes to set
     */
    public void setMaxDes(float maxDes) {
        this.maxDes = maxDes;
    }
    
    
    
}
