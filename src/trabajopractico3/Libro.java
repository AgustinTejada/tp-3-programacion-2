/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

import java.time.LocalDate;

/**
 *
 * @author Agustin
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public boolean setAñoPublicacion(int año) {
        int añoActual = LocalDate.now().getYear();
        if (año >= 1450 && año <= añoActual) {
            this.añoPublicacion = año;
            return true;
        }
        System.out.println("Año inválido: " + año + ". Debe estar entre 1450 y " + añoActual + ".");
        return false;
    }

    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + añoPublicacion + ")");
    }
}
