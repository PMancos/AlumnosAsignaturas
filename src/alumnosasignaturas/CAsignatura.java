

package alumnosasignaturas;


public class CAsignatura {
    
    //Atributos
    private String nombre;
    private double nota;
    
    //Constructores
    /**
     * 
     * @param nombre
     * @param nota 
     */
    public CAsignatura(String nombre,double nota) {
        setNombre(nombre);
        setNota(nota);
    }

    public CAsignatura(String nombre) {
        setNombre(nombre);
    }
    
    
    
    //CONSTRUCTOR COPIA
    public CAsignatura(CAsignatura asig){
        this.nombre=asig.nombre;
        this.nota=asig.nota;
    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    //SETTERS
    public void setNombre(String nombre) {
        if(nombre.length()>0){
        this.nombre = nombre;
        }else{
            System.out.println("El nombre esta vacio");
        }
    }

    public boolean setNota(double nota) {
        if(nota>=1 && nota<=10){
            
        this.nota = nota;
        return true;
    }
        else{
            System.out.println("Error, nota no válida.");
            return false;
        }
 }

    @Override
    public String toString() {
        return nombre +":"+nota;
    }
    
    
    
    
    
    
    
    
}
