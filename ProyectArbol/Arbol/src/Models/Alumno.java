package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int matricula;
    private String estatus;
    private ArrayList<String> activo;
    private ArrayList<String> inactivo;
    private ArrayList<String> bajaDefinitiva;
    private ArrayList<String> bajaAcademica;
    private ArrayList<String> bajaTemporal;
    private ArrayList<String> egresado;
    private ArrayList<String> titulado;

    public Alumno() {
        //inicializar las listas
        activo = new ArrayList<>();
        inactivo = new ArrayList<>();
        bajaDefinitiva = new ArrayList<>();
        bajaAcademica = new ArrayList<>();
        bajaTemporal = new ArrayList<>();
        egresado = new ArrayList<>();
        titulado = new ArrayList<>();
    }

    public void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);

        //ingresar el nombre del alumno
        System.out.println("Ingrese el nombre del alumno:");
        String alumno = scanner.nextLine();
        System.out.println("Ingrese la matricula del alumno:");
        String matricula = scanner.nextLine();

        //opciones de estatus
        System.out.println("Elija tipo de estatus:");
        System.out.println("1. Activo");
        System.out.println("2. Inactivo");
        System.out.println("3. Baja definitiva");
        System.out.println("4. Baja academica");
        System.out.println("5. Egresado");
        System.out.println("6. Titulado");
        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                activo.add(alumno);
                break;
            case 2:
                inactivo.add(alumno);
                break;
            case 3:
                bajaDefinitiva.add(alumno);
                break;
            case 4:
                bajaAcademica.add(alumno);
                break;
            case 5:
                bajaTemporal.add(alumno);
                break;
            case 6:
                egresado.add(alumno);
                break;
            case 7:
                titulado.add(alumno);
                break;
            default:
                System.out.println("Estado de alumno inválido");
                break;
        }
    }


}
