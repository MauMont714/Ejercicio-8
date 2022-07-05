/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Mauricio Montiel
 */
public class Ejercicio8 {

    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return nombre;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return edad;
        }
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public String getTelefono(){
            return telefono;
        }
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(22);
        persona1.setNombre("Mauricio");
        persona1.setTelefono("2223678459");
        System.out.println("Mi nombre es " + persona1.getNombre() + ", tengo " + persona1.getEdad() + " años y mi numero es " + persona1.getTelefono());    
    }
    
}
