/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author Agustin
 */
public class TrabajoPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) ESTUDIANTE
        System.out.println("=== 1) Estudiante ===");
        Estudiante e1 = new Estudiante("Agustín", "Tejada", "Programación II", 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(3.0);      // debería topear en 10
        e1.mostrarInfo();
        e1.bajarCalificacion(12.0);     // no debe bajar de 0
        e1.mostrarInfo();

        // 2) MASCOTA
        System.out.println("\n=== 2) Mascota ===");
        Mascota m1 = new Mascota("Mora", "Perro", 2);
        m1.mostrarInfo();
        m1.cumplirAnios();              // edad = 3
        m1.mostrarInfo();

        // 3) LIBRO (encapsulamiento + validación)
        System.out.println("\n=== 3) Libro ===");
        Libro l1 = new Libro("Clean Code", "Robert C. Martin", 2008);
        l1.mostrarInfo();
        boolean ok1 = l1.setAñoPublicacion(1200); // inválido
        System.out.println("¿Actualización válida? " + ok1);
        boolean ok2 = l1.setAñoPublicacion(2010); // válido
        System.out.println("¿Actualización válida? " + ok2);
        l1.mostrarInfo();

        // 4) GALLINAS
        System.out.println("\n=== 4) Gallinas ===");
        Gallina g1 = new Gallina("G-001", 1);
        Gallina g2 = new Gallina("G-002", 2);
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        // 5) NAVE ESPACIAL
        System.out.println("\n=== 5) Nave Espacial ===");
        NaveEspacial nave = new NaveEspacial("Andrómeda", 50, 100);
        nave.mostrarEstado();
        nave.despegar();
        // Intentar avanzar sin recargar lo suficiente
        nave.avanzar(60);               // debería fallar por combustible insuficiente
        // Recargar y avanzar correctamente
        nave.recargarCombustible(40);   // 50 + 40 = 90 (<= 100 OK)
        nave.avanzar(60);               // consume 60 -> quedarán 30
        nave.mostrarEstado();
        // Intento exceder la capacidad
        nave.recargarCombustible(80);   // debería fallar (30 + 80 > 100)
        nave.mostrarEstado();
    }
    
}
