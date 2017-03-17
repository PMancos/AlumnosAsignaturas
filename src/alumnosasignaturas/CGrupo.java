
package alumnosasignaturas;

import java.util.ArrayList;


public class CGrupo {
    
    private String nombre;
    private ArrayList <CAlumno> alumnos;

  
    public CGrupo(String nombre) {
       setNombre(nombre);
       alumnos=new ArrayList<CAlumno>(30);
        
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
    
    public void mostrarDatosGrupo(){
        System.out.println("nombre del grupo: "+nombre);
        System.out.println("numero de alumnos: "+numeroAlumnos());
        
        for(int i=0; i<numeroAlumnos();i++){
            System.out.println("Alumno "+(i+1));
        System.out.println(alumnos.get(i).toString());
        }
    }

    public ArrayList<CAlumno> getAlumnos() {
        return alumnos;
    }
    
    
}
