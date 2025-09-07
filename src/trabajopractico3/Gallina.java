/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author Agustin
 */
public class Gallina {
    private String idGallina;
    private int edad; // en años
    private int huevosPuestos;

    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina +
                " | Edad: " + edad +
                " | Huevos puestos: " + huevosPuestos);
    }
}
