package Interfaces;
//@Autor Cesar
import Libreria.Material;

@FunctionalInterface
public interface CreadorMaterial<T extends Material> {
    T crear(String id, String titulo, String descripcion,
            String autor, String anio, String extra1,
            String extra2, boolean disponible);
}
