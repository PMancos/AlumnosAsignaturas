

package alumnosasignaturas;

import java.util.ArrayList;
import java.util.Scanner;


public class CAlumno {
    static Scanner tc=new Scanner(System.in);
    //Atributos
   private String dni;
   private String nombre;
   private String direccion;
   private ArrayList <CAsignatura> listaAsignaturas; //ArrayList de asignaturas

    public CAlumno(String dni, String nombre, String direccion) {
        
        listaAsignaturas=new ArrayList<>();
        setDni(dni);
        setNombre(nombre);
        this.direccion = direccion;
        System.out.println("Objeto alumno creado");
        
    }
    //CONSTRUCTOR COPIA
    public CAlumno(CAlumno alum){
        
        setDni(alum.dni);
        setNombre(alum.nombre);//PARA QUE NO SE COPIEN LOS ATRIBUTOS DEL OTRO ALUMNO(NOMBRE,DNI,DIRECCION...)
        setDireccion(alum.direccion);
        
        listaAsignaturas = new ArrayList<CAsignatura>();
        //copiar las asignaturas en la lista
        CAsignatura asig;
        for(int i=0; i<alum.listaAsignaturas.size();i++){
            //crear un objeto CAsignatura
            //por medio del contructor copia
            asig=new CAsignatura(alum.listaAsignaturas.get(i));
            listaAsignaturas.add(asig);
            //lo mismo en 1 linea
            //listaAsig.add(new Casignatura(x.listaAsignatura));
        }
        
 }

    public CAsignatura obtenerAsignatura(int pos){
        CAsignatura asig=null;
        if(pos >= 0 && pos <listaAsignaturas.size())
               asig=listaAsignaturas.get(pos);
        else
            System.out.println("Error, indice fuera de rango");
        
        return asig;
        
//        if(pos<listaAsignaturas.size()){ //size numero de contenido
//            return listaAsignaturas.get(pos);
//        }else
//            return null;
   }  
    
    public void aniadirAsignatura(CAsignatura a){
        listaAsignaturas.add(a);
    }
    
    public int numeroAsignaturas(){
        return listaAsignaturas.size();
    }
    
    public double obtenerNotaMedia(){
        double sumaNotas=0;
        if(numeroAsignaturas()>0){
      for(int i=0; i<numeroAsignaturas();i++){
          
         sumaNotas+=listaAsignaturas.get(i).getNota();
      
        }
      }
        return sumaNotas/numeroAsignaturas();
    }
    
    public String getDni() {
       return dni;
        
    }

    public void setDni(String dni) {
         do{
        if(dni.length()==9){
           this.dni=dni;
        }
        else{
            
             System.out.println("DNI incorrecto. Introduce el DNI de nuevo:");
             dni=tc.nextLine();
        }
         }while(dni.length()!=9);
         this.dni=dni;
    }
         


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        do{
        if(!nombre.isEmpty()){
        this.nombre = nombre;
        }
        else{
            System.out.println("Error. Cadena vacía introduce el nombre de nuevo.");
        }
        }while(nombre.isEmpty());
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        do{
        if(!direccion.isEmpty()){
        this.direccion = direccion;
        }
        else{
            System.out.println("Error. Cadena vacía, introduce la dirección de nuevo:");
        }
        }while(nombre.isEmpty());
    }

    
    @Override
    public String toString() {
       String result;
        result="DNI: "+dni+"   Nombre: "+nombre+"\nNº Asignaturas: "+listaAsignaturas.size()+"\nDireccion: "+direccion+"\n";
               for(int i=0;i<listaAsignaturas.size();i++){
                   
                 result+=  listaAsignaturas.get(i).toString()+"\n";
                   
               }
               
                 return result+"Nota media: "+obtenerNotaMedia();
    }
    
    
    
    
    
    
}
