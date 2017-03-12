
package alumnosasignaturas;


import java.util.Scanner;


public class CAplicacion {

    public static Scanner teclado=new Scanner (System.in);
    public static void main(String[] args) {
        
     
     int op;   
     op=menu();   
       
     switch(op){
         
         case 1:  
         
         
         
     }  
        
        
        
        
        
        
    }
    public static int menu(){
        int op;
        System.out.println("1.Matricular\n2.Baja de alumno\n3.Poner notas\n4.Mostrar "
                + "expediente\n5.Mostrar datos de todo el grupo\n6.Salir");
        System.out.println("Introduce una opción: ");
        
        op=teclado.nextInt();
        return op;
    }
    public void matricular(CGrupo a){
        System.out.println("Introduce el nombre al grupo:");
        String nombreGrupo=teclado.nextLine();
           
        new CGrupo(nombreGrupo);
       
        System.out.println("Introduce el dni:");
        String dni=teclado.nextLine();
        
        System.out.println("Introduce el nombre del alumno:");
        String nombreAlumno=teclado.nextLine();
        
        System.out.println("Introduce la direccion del alumno:");
        String direccion=teclado.nextLine();
        
        new CAlumno(dni, nombreAlumno, direccion);
        
        System.out.println("Número de asignaturas a matricularse: ");
        int numAsig=teclado.nextInt();
        
        for(int i=0;i<numAsig;i++){
        System.out.println("Introduce el nombre de la asignatura");
        String nombreAsig=teclado.nextLine();
        new CAsignatura(nombreAsig);
        
        }
        
        
        
        
    }
}
