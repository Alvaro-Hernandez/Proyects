/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_vector;
import javax.swing.JOptionPane;
/**
 *
 * @author Meyling
 */
public class Suma_Vector {

    public static void main(String[] args) {
        int Nvector;
        float Acum=0;
        float Prom;
        Nvector=Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero de elementos del Arreglos")); 
        for (int i=0; i<Nvector;i++)
        {
        Acum = Acum + Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Ingrese un Numero"));
        }   
        Prom=Acum/Nvector;
        System.out.println("La Suma de los elementos es: "+Acum);
        System.out.println("La media aritmetica de los elementos es: "+ Prom);  
    }   
    
}
