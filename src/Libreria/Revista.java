package Libreria;
//@Autor Ricardo
import Base_de_Datos.Funciones_BD;
import Interfaces.IPrestable;

public class Revista extends Material implements IPrestable {

    private String categoria;
    private String editor;

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Revista(String id, String titulo, String descripcion, String autor, String anio,
            String categoria, String editor, boolean disponible) {
        super(id, titulo, descripcion, autor, anio, categoria, editor, "Revista", disponible);
        this.categoria = categoria;
        this.editor = editor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[REVISTA] " + titulo + " (" + anio + ")");
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Editor: " + editor);
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
