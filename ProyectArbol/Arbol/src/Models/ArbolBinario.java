package Models;

import java.util.Scanner;

public class ArbolBinario {
    Nodo raiz = new Nodo();
    Scanner entrada = new Scanner(System.in);

    public void crearRaiz(int valor) {
        raiz.setDato(valor);
        crearArbol(raiz);
    }

    public void crearArbol(Nodo nodo) {
        int valor, respuesta;
        System.out.print("¿Existe nodo por la izquierda de " + nodo.getDato() + " (1)SI (2)No: ");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            System.out.print("Ingrese el valor del nodo: ");
            valor = entrada.nextInt();
            Nodo subizquierdo = new Nodo(valor); // Raíz del subárbol izquierdo
            nodo.setIzq(subizquierdo); // Enlace
            crearArbol(subizquierdo);
        }

        System.out.print("¿Existe nodo por la derecha de " + nodo.getDato() + " (1)SI (2)No: ");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            System.out.print("Ingrese el valor del nodo: ");
            valor = entrada.nextInt();
            Nodo subderecho = new Nodo(valor); // Raíz del subárbol derecho
            nodo.setDer(subderecho); // Enlace
            crearArbol(subderecho);
        }
    }

    public void preorden(Nodo raiz) {
        if (raiz != null) {
            System.out.println(raiz.getDato());
            preorden(raiz.getIzq());
            preorden(raiz.getDer());
        }
    }

    public void visualizarRecorridos() {
        System.out.println("Preorden");
        preorden(raiz);
        entrada.close();
    }
}
