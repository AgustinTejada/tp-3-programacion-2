/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author Agustin
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;       // unidades actuales
    private final double capacidadMax;// unidades máximas
    private final double consumoPorDistancia = 1.0; // 1 unidad por distancia

    public NaveEspacial(String nombre, double combustibleInicial, double capacidadMax) {
        this.nombre = nombre;
        this.capacidadMax = Math.max(0, capacidadMax);
        this.combustible = Math.min(Math.max(0, combustibleInicial), this.capacidadMax);
    }

    public boolean despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado.");
            return true;
        }
        System.out.println(nombre + " no puede despegar: sin combustible.");
        return false;
    }

    public boolean avanzar(double distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return false;
        }
        double requerido = distancia * consumoPorDistancia;
        if (combustible >= requerido) {
            combustible -= requerido;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
            return true;
        } else {
            System.out.println(nombre + " no puede avanzar: combustible insuficiente (req: " + requerido + ", tiene: " + combustible + ").");
            return false;
        }
    }

    public boolean recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return false;
        }
        double nuevoNivel = combustible + cantidad;
        if (nuevoNivel > capacidadMax) {
            System.out.println("No se puede recargar " + cantidad + ": supera la capacidad máxima (" + capacidadMax + ").");
            return false;
        }
        combustible = nuevoNivel;
        System.out.println("Recarga exitosa. Combustible actual: " + combustible + "/" + capacidadMax);
        return true;
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadMax);
    }
}
