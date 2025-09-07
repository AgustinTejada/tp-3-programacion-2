/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author Agustin
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; // asumimos escala 0..10

    public Estudiante(String nombre, String apellido, String curso, double calificacionInicial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacionInicial);
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        setCalificacion(this.calificacion - puntos);
    }

    // Encapsulación con validación centralizada
    private void setCalificacion(double nueva) {
        if (nueva < 0) nueva = 0;
        if (nueva > 10) nueva = 10;
        this.calificacion = nueva;
    }
}
