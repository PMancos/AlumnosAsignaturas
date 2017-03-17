/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosasignaturas;

/**
 *
 * @author admin1
 */
public class PCGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CGrupo g1=new CGrupo("1DAM");
        
        g1.mostrarDatosGrupo();
        
        g1.aniadirAlumno(new CAlumno("15687458A", "Marico", "Bilbao"));
            g1.alumno(0).aniadirAsignatura(new CAsignatura("Prog", 5));
            g1.alumno(0).aniadirAsignatura(new CAsignatura("BD", 7));
        
        g1.aniadirAlumno(new CAlumno("22222222A", "Laurentzi", "Basauri"));
            g1.alumno(1).aniadirAsignatura(new CAsignatura("Prog", 5));
            g1.alumno(1).aniadirAsignatura(new CAsignatura("BD", 7));
            g1.alumno(1).aniadirAsignatura(new CAsignatura("LM", 9));
            
        g1.aniadirAlumno(new CAlumno("33333333A", "Arrate", "Santurtzi"));
            g1.alumno(2).aniadirAsignatura(new CAsignatura("Prog", 6));
            g1.alumno(2).aniadirAsignatura(new CAsignatura("BD", 7));
            g1.alumno(2).aniadirAsignatura(new CAsignatura("BD", 8));
            
        g1.mostrarDatosGrupo();
        
        
    }
    
    
}
