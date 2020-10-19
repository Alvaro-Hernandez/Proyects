/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_arrays;

/**
 *
 * @author Alvaro
 */
public class Arreglos_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Numeros = new int[4];
        // Tambien esta la Manera de Hacerlo Diferente
        //Como int[] Numeros = new int[10,25,35,45];
        Numeros[0] = 10;
        Numeros[1] = 25;
        Numeros[2] = 35;
        Numeros[3] = 45;
        
        for(int i=0;i<4;i++){
        System.out.println(Numeros[i]);
        }
    }
    
}
