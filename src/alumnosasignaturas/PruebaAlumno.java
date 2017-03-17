
package alumnosasignaturas;


public class PruebaAlumno {

    
    public static void main(String[] args) {
      
     CAsignatura a1=new CAsignatura("Bases de Datos", 10);
     CAsignatura a2=new CAsignatura("Programación", 5);
     CAlumno alum1=new CAlumno("987654321","Loren", "C/Correos");
        
     alum1.aniadirAsignatura(a1);
     alum1.aniadirAsignatura(a2);
     
     CAlumno al2=new CAlumno(alum1); //Crear copia
     
        System.out.println("Informacion de alum1\n"+alum1.toString());
        System.out.println("");
        //amtes de cambiar datos
        System.out.println("Datos del alumnos copia: "+al2.toString());
        al2.setNombre("Miren");
        al2.setDni("123456789");
        al2.setDireccion("Calle los pepitos");
        System.out.println("informacion de la copia despues de cambair los datos: "+al2.toString());
        
        al2.aniadirAsignatura(new CAsignatura("Sistemas", 5));
        System.out.println("Informacion de al2: "+al2.toString());
        
     
     //System.out.println("Datos de la asignatura: "+alum1.obtenerAsignatura(0));
     //System.out.println("Numero de asignaturas: "+alum1.numeroAsignaturas());   
        
       // System.out.println("Nota media: "+alum1.obtenerNotaMedia());  
        
        
        
        
    }
    
}
