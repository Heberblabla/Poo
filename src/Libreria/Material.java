package Libreria;
//@Autor Ricardo
public abstract class Material {
    public String id;
    public String titulo;
    public String descripcion;
    public String autor;
    public String anio;
    public String extra1;
    public String extra2;
    public String cla;
    public Boolean disponibilidad;

    public Material(String id, String titulo, String descripcion, String autor, String anio,String extra1,String extra2,String cla,Boolean dispo) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.anio = anio;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.cla = cla;
        this.disponibilidad = dispo;
    }

    // Método en común: buscar palabra clave en la descripción
    public boolean buscarPorPalabraClave(String palabra) {
        if (palabra == null || palabra.isEmpty()) return false;
        return descripcion.toLowerCase().contains(palabra.toLowerCase());
    }

    public abstract void mostrarInfo();
}



