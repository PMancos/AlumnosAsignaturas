
package alumnosasignaturas;

import java.util.ArrayList;


public class CGrupo {
    
    private String nombre;
    private ArrayList <CAlumno> alumnos;

  
    public CGrupo(String nombre) {
        setNombre(nombre);
       new ArrayList<CAlumno>(30);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(!nombre.isEmpty()){
        this.nombre = nombre;
        }
    }
    
    public CAlumno alumno(int pos){
        
      if(pos<alumnos.size()){
          return alumnos.get(pos);
      }else{
          return null;
      }
        
    }
    
    public void aniadirAlumno(CAlumno alum ){
       
       alumnos.add(alum);
    }
    
    public int numeroAlumnos(){
        return alumnos.size();
    }
    
    
    
}
