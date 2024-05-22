import Models.Alumno;
import Models.ArbolBinario;

import java.util.Scanner;

public class Main {
    private static ArbolBinario arbolBinario = new ArbolBinario(); // Inicializar la instancia estática de ArbolBinario

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno alumno = new Alumno(); //instancia de la clase Alumno
        int opc = 0;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Arbol");
            System.out.println("2. Alumnos");
            System.out.println("3. Salir");

            if (entrada.hasNextInt()) {
                opc = entrada.nextInt();
            } else {
                break;
            }

            switch (opc) {
                case 1:
                    do {
                        System.out.println("1. Crear árbol\n2. Imprimir recorridos\n3. Salir");
                        opc = entrada.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Ingrese el valor del nodo raíz:");
                                int dato = entrada.nextInt();
                                arbolBinario.crearRaiz(dato);
                                break;
                            case 2:
                                arbolBinario.visualizarRecorridos();
                                break;
                            case 0:
                                System.out.println("Regresando al Menú Principal...");
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    } while (opc !=0);
                    break; //para poder regresar al menú prinipal
                case 2:
                    int opcAlumnos;
                    do {
                        System.out.println("Menú Alumnos:");
                        System.out.println("1. Agregar alumno");
                        System.out.println("2. Ver lista de estudiantes");
                        System.out.println("3. Ver estatus");
                        System.out.println("0. Regresar");

                        if (entrada.hasNextInt()) {
                            opcAlumnos = entrada.nextInt();
                        } else {
                            break;
                        }

                        switch (opcAlumnos) {
                            case 1:
                                alumno.agregarAlumno(); //método en la clase de Alumno
                                break;
                            case 2:
                                //lista de estudiantes
                                break;
                            case 3:
                                //estatus
                                break;
                            case 0:
                                System.out.println("Regresando al Menú Principal...");
                                break;
                            default:
                                System.out.println("Opción no válida en el Menú Alumnos");
                                break;
                        }
                    } while (opcAlumnos != 0);
                    break;//para regresar al menú principal
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida en el Menú Principal");
                    break;
            }
        } while (opc != 3);

        entrada.close(); // Cerrar el Scanner al finalizar
    }
}
