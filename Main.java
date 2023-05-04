/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author laura
 */
public class Main {
    public static void main(String[] args) {
        ArbolB juego = new ArbolB();
        List<Integer> cartas = new ArrayList<>();
        for(int i = 1; i <= 13; i++) {
            cartas.add(i);
        }

        for(int i = 0; i < 5; i++) {
            int op = (int)(Math.random() * (cartas.size()));
            int valor = cartas.remove(op);
            juego.insertar(valor);
        }

        System.out.println("Cartas: ");

            juego.juegoPre();

        

        
    }
}
