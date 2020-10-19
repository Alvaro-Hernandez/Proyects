/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;

import java.util.Scanner;
/**
 *
 * @author Alvaro Hernandez
 */
public class Class_Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        //Variables para cada dato al leer desde el teclado
        String NombreP;
        char GeneroP;
        int EdadP;
        
        C_Person[] p= new C_Person[3];//arreglo de objetos
        //asignacion de datos de cada objeto
        //utilixando el constructor de la clase definida C_Person
        //P[0]= new C_Person(20, "Ana",'F');
        
        for (int i=0; i<p.length; i++){
        
        System.out.println("Ingrese el nombre de la Persona");
        NombreP=entrada.nextLine();
        System.out.println("Ingrese el Genero de la Persona");
        GeneroP=entrada.next().charAt(0);
        System.out.println("Ingrese el Edad de la Persona");
        EdadP=entrada.nextInt();
        //Para evitar salte de lineas al leer datos
        entrada.nextLine();
        
        p[i]= new C_Person(EdadP,NombreP, GeneroP );
        
        }
        
        for (C_Person p1 : p){
        
        System.out.println(p1.getNombre() + " " + p1.getEdad() + " " + p1.getGenero());
        //llamada al metodo de funcionalidad especifica de la clase
        
        p1.CategoriaEdad();
        }
            
    }
    
}
