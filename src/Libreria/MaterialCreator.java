package Libreria;
//@Autor Ricardo
import Interfaces.CreadorMaterial;

public class MaterialCreator<T extends Material> {

    private final CreadorMaterial<T> creador; // Constructor genérico

    public MaterialCreator(CreadorMaterial<T> creador) {
        this.creador = creador;
    }

    public T crear(String id, String titulo, String descripcion,
                   String autor, String anio, String extra1,
                   String extra2, boolean disponible) {

        return creador.crear(id, titulo, descripcion,
                             autor, anio, extra1, extra2,
                             disponible);
    }
}
