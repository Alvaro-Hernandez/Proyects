/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;

/**
 *
 * @author Meyling
 */
public class C_Person {

    public C_Person(int Edad, String Nombre, char Genero) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Genero = Genero;
    }
    
    private int Edad;
    private String Nombre;
    private char Genero;
   
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }
    
    public void CategoriaEdad(){
        
        if (getEdad()>18)
            System.out.println("Persona Mayor de Edad");
        else
            System.out.println("Persona Menor de Edad");
    }
}
