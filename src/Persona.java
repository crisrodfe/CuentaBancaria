
import java.io.Serializable;



/**
 *
 * @author CrisRodFe
 */
public class Persona implements Serializable{
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;
    
    /**
     * Constructor
     */
    public Persona(){        
    }
    /**
     * Constructor con parámteros
     * @param nombre
     * @param apellidos
     * @param fechaNacim 
     */
    public Persona(String nombre,String apellidos,String fechaNacim){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacim= fechaNacim;
    }
        
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the fechaNacim
     */
    public String getFechaNacimiento() {
        return fechaNacim;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @param fechaNacimi 
     */
    public void setFechaNacimiento(String fechaNacimi) {
        this.fechaNacim = fechaNacim;
    }
   

}
