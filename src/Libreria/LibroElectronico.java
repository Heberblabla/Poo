package Libreria;
//@Autor Ricardo
public class LibroElectronico extends Material {

    private String formato;

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }
    private String urlDescarga;

    public LibroElectronico(String id, String titulo, String descripcion, String autor, String anio,
            String formato, String urlDescarga,boolean disponible) {
        super(id, titulo, descripcion, autor, anio, formato, urlDescarga, "Libro", disponible);
        this.formato = formato;
        this.urlDescarga = urlDescarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[LIBRO ELECTRONICO] " + titulo + " (" + anio + ")");
        System.out.println("Autor: " + autor);
        System.out.println("Formato: " + formato);
        System.out.println("URL: " + urlDescarga);
        System.out.println("Descripción: " + descripcion + "\n");
    }
}
