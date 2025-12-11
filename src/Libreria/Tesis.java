package Libreria;
//@Autor Ricardo
import Base_de_Datos.Funciones_BD;
import Interfaces.IPrestable;

public class Tesis extends Material implements IPrestable {

    private String universidad;
    private String asesor;

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public Tesis(String id, String titulo, String descripcion, String autor, String anio,
            String universidad, String asesor, boolean disponible) {
        super(id, titulo, descripcion, autor, anio, universidad, asesor, "Tesis", disponible);
        this.universidad = universidad;
        this.asesor = asesor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[TESIS] " + titulo + " (" + anio + ")");
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Asesor: " + asesor);
        System.out.println("Descripción: " + descripcion + "\n");
    }

    @Override
    public String prestar(String nombre, String apellido, String dni) {

        // Cambiar disponibilidad
        this.disponibilidad = false;

        // Conexión a BD
        Funciones_BD dao = new Funciones_BD();

        // Insertar préstamo
        String resultado = dao.InsertarPrestamo(this.id, nombre, apellido, dni);

        return resultado; // OK, usuario no encontrado, error, etc.
    }

}
