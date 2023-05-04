/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author laura
 */
public class Nodos {
    private int valor;
    private Nodos izq;
    private Nodos der;
    
    public Nodos(int valor){
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodos getIzq() {
        return izq;
    }

    public Nodos getDer() {
        return der;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void insertar(int Valor){
        if(Valor < this.valor){
            //insertar nodo izquierdo
            if(this.izq == null){
                this.izq = new Nodos(Valor);
            }else{
                this.izq.insertar(Valor); 
            }
        }else{
            //insertar nodo derecho
            if(this.der == null){
                this.der = new Nodos(Valor);
            }else{
                this.der.insertar(Valor);
            }
        }
    }
    
    
}
