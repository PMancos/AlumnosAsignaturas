package alumnosasignaturas;

import java.util.Scanner;

public class CAplicacion {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Crear el objeto de la clase CGrupo
        CGrupo grupo = new CGrupo("1DAM");

        int op;
        do {
            op = menu();

            switch (op) {

                case 1:
                    matricular(grupo);
                    break;
                case 2:
                    eliminar(grupo);
                    break;
                case 3:;
                    break;
                case 4:
                    mostrarExpediente(grupo);
                    break;
                case 5:
                    mostrarGrupo(grupo);
                    break;
                case 6:
                    System.out.println("Fin del programa");
                    break;
            }

        } while (op != 6);

    }

    public static int menu() {
        int op;
        System.out.println("");
        System.out.println("1.Matricular\n2.Baja de alumno\n3.Poner notas\n4.Mostrar "
                + "expediente\n5.Mostrar datos de todo el grupo\n6.Salir");
        System.out.println("Introduce una opción: ");
        System.out.println("");
        op = teclado.nextInt();
        return op;
    }

    public static void matricular(CGrupo grupo) {

        teclado.nextLine();
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce el dni del alumno: ");
        String dni = teclado.nextLine();

        System.out.println("Introduce la direccion del alumno: ");
        String direccion = teclado.nextLine();

        CAlumno al = new CAlumno(dni, nombre, direccion);

        System.out.println("En cuantas asignaturas quieres matricularte?: ");
        int cuantas = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < cuantas; i++) {
            System.out.println("Introduce el nombre de la asignatura:");
            String nombreAsig = teclado.nextLine();
            CAsignatura asig = new CAsignatura(nombreAsig);
            al.aniadirAsignatura(asig);
        }
        grupo.aniadirAlumno(al);
        System.out.println("Alumno añadido !!!");
    }

    public static void eliminar(CGrupo grupo) {
        boolean encontrado = false;
        int i = 0;
        int pos = 0;

        teclado.nextLine();
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();
        while (!encontrado && i < grupo.numeroAlumnos()) {
            if (grupo.alumno(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                pos = i;
            } else {
                i++;
            }
            char resp;
            if (encontrado) {
                System.out.println("Alumno " + grupo.alumno(pos).toString() + " encontrado");
                do {
                    System.out.println("realmente deseas eliminarlo? (S/N)");
                    resp = teclado.nextLine().charAt(0);
                } while (resp != 'n' && resp != 'N' && resp != 'S' && resp != 's');
                if (resp == 's' || resp == 'S') {
                    grupo.getAlumnos().remove(pos);
                }
            } else {
                System.out.println("Opcion cancelada !!");
            }
        }
    }

    public static void ponerNotas(CGrupo grupo) {
        teclado.nextLine();
        boolean encontrado = false;
        int i = 0;

        System.out.println("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();
        while (!encontrado && i < grupo.numeroAlumnos()) {
            if (nombre.equalsIgnoreCase(grupo.alumno(i).getNombre())) {
                encontrado = true;
            } else {
                i++;
            }

        }
        if (encontrado) {
            CAlumno alumno = grupo.alumno(i);
            System.out.println("Se van a introducir las notas del alumno "+nombre);
            double nota;
            boolean notaValida;
            for(int j=0;j<alumno.numeroAsignaturas();j++){
                do{
                    System.out.println("Nota de la asignatura"+
                            alumno.obtenerAsignatura(j).getNombre());
                    nota=teclado.nextDouble();
                    notaValida=alumno.obtenerAsignatura(j).setNota(nota);
                }while (!notaValida);
        }
        
    }
    }
    public static void mostrarExpediente(CGrupo grupo) {
        teclado.nextLine();
        boolean encontrado = false;
        int i = 0;

        System.out.println("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();
        while (!encontrado && i < grupo.numeroAlumnos()) {
            if (nombre.equalsIgnoreCase(grupo.alumno(i).getNombre())) {
                encontrado = true;

            } else {
                i++;
            }

        }
        if (encontrado) {
            System.out.println(grupo.alumno(i).toString());
        } else {
            System.out.println("El alumno no existe");

        }

    }

    public static void mostrarGrupo(CGrupo grupo) {
        grupo.mostrarDatosGrupo();
    }
}
