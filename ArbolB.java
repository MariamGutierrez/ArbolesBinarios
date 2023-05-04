/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ArbolB {
    Nodos raiz;
    
    public ArbolB(){
        this.raiz = null;
    }
    
    public void insertar(int valor){
        if(this.raiz == null){
            this.raiz = new Nodos(valor);
        }else{
            this.raiz.insertar(valor);
        }
    }
    //preorden
    public void dispararPre(){
        //this.preorden(this.raiz);
    }



   public void juegoPre() {
    System.out.println("Comencemos el juego!");
    System.out.println("Para empezar, la primera carta es: " + raiz.getValor());
    int puntos = 0;
    Nodos nodoActual = raiz;
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Es la siguiente carta es mayor o menor que " + nodoActual.getValor() + "? (M/m para mayor, L/l para menor)");
        String resp = scanner.nextLine();
        if (resp.toLowerCase().charAt(0) == 'm') {
            nodoActual = nodoActual.getDer();
        } else {
            nodoActual = nodoActual.getIzq();
        }
        if (nodoActual == null) {
            System.out.println("Fin del juego.\n");
            break;
        }
        System.out.println("La siguiente siguiente carta es: " + nodoActual.getValor());
        System.out.println("¿Fue tu respuesta correcta? (S/s para sí, N/n para no)");
        resp = scanner.nextLine();
        if (resp.toLowerCase().charAt(0) == 's') {
            puntos += 50;
            System.out.println("¡Correcto! Tienes " + puntos + " puntos.");
        } else {
            puntos -= 25;
            System.out.println("Lo siento, respuesta incorrecta. Tienes " + puntos + " puntos.");
        }
    }
       System.out.println("Puntos obtenidos: " + puntos);
}


    //inorden
    public void dispararIn(){
        this.inorden(this.raiz);
    }
    
    public void inorden(Nodos nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            inorden(nodo.getIzq());
            System.out.println(nodo.getValor());
            inorden(nodo.getDer());
        }
    }
    //Postorden
    public void dispararPost(){
        this.postorden(this.raiz);
    }
    
    public void postorden(Nodos nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            postorden(nodo.getIzq());
            postorden(nodo.getDer());
            System.out.println(nodo.getValor());
        }
    }
}
