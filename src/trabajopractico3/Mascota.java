/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author Agustin
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(edad, 0);
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad);
    }

    public void cumplirAnios() {
        this.edad++;
    }
}
