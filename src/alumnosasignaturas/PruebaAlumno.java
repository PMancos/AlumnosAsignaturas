
package alumnosasignaturas;


public class PruebaAlumno {

    
    public static void main(String[] args) {
      
     CAsignatura a1=new CAsignatura("Bases de Datos", 10);
     CAsignatura a2=new CAsignatura("Programación", 5);
     CAlumno alum1=new CAlumno("169987654","Loren", "C/Correos");
        
     alum1.aniadirAsignatura(a1);
     alum1.aniadirAsignatura(a2);
     
     //System.out.println("Datos de la asignatura: "+alum1.obtenerAsignatura(0));
     //System.out.println("Numero de asignaturas: "+alum1.numeroAsignaturas());   
        
       // System.out.println("Nota media: "+alum1.obtenerNotaMedia());  
        
        System.out.println("Datos del alumno: "+alum1.toString());   
        
        
    }
    
}
