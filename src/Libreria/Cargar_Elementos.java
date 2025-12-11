package Libreria;
//@Autor Ricardo
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cargar_Elementos {
    
    public static HashMap<String, ArrayList<String>> prestamos = new HashMap<>();
    public static HashMap<String, Usuario> usuarios = new HashMap<>();
    public static List<Material> materiales = new ArrayList<>();
    public static List<LibroElectronico> libros = new ArrayList<>();
    public static List<Revista> revistas = new ArrayList<>();
    public static List<Tesis> tesis = new ArrayList<>();

    /**
     * Método limpio que crea el material según la clasificación SIN HashMap,
     * usando solo switch Y devuelve un Material (tu requisito)
     */
    public static Material crearMaterial(
            String clasificacion,
            String id, String titulo, String descripcion,
            String autor, String anio,
            String extra1, String extra2,
            boolean disponible) {

        clasificacion = clasificacion.toLowerCase();
        Material nuevo = null;

        switch (clasificacion) {

            case "libro" -> {
                nuevo = new LibroElectronico(
                        id, titulo, descripcion, autor, anio,
                        extra1, extra2, disponible
                );
                libros.add((LibroElectronico) nuevo);
            }

            case "revista" -> {
                nuevo = new Revista(
                        id, titulo, descripcion, autor, anio,
                        extra1, extra2, disponible
                );
                revistas.add((Revista) nuevo);
            }

            case "tesis" -> {
                nuevo = new Tesis(
                        id, titulo, descripcion, autor, anio,
                        extra1, extra2, disponible
                );
                tesis.add((Tesis) nuevo);
            }

            default -> {
                System.out.println("Clasificación no válida: " + clasificacion);
                return null;
            }
        }

        // Agregar SIEMPRE a la lista general
        materiales.add(nuevo);
        return nuevo;
    }

    //funcion q actualiza algun material por id
    public static boolean actualizarMaterialPorId(String id, String nuevoTitulo, String nuevaDescripcion, String nuevoAutor, String nuevoAnio, String extra1, String extra2, String cla, Boolean dispo) {

        // 1. Buscar en la lista general (materiales)
        Material encontrado = null;

        for (Material m : materiales) {
            if (m.id.equalsIgnoreCase(id)) {
                encontrado = m;
                break;
            }
        }

        // Si no existe → no hacer nada
        if (encontrado == null) {
            System.out.println("No existe material con ID: " + id);
            return false;
        }

        // 2. Actualizar datos comunes
        encontrado.titulo = nuevoTitulo;
        encontrado.descripcion = nuevaDescripcion;
        encontrado.autor = nuevoAutor;
        encontrado.anio = nuevoAnio;
        encontrado.cla = cla;
        encontrado.disponibilidad = dispo;

        // 3. Actualizar datos según tipo
        if (encontrado instanceof LibroElectronico libro) {
            libro.setFormato(extra1);
            libro.setUrlDescarga(extra2);
        } else if (encontrado instanceof Revista revista) {
            revista.setCategoria(extra1);
            revista.setEditor(extra2);
        } else if (encontrado instanceof Tesis tesisObj) {
            tesisObj.setUniversidad(extra1);
            tesisObj.setAsesor(extra2);
        }

        return true; // actualización exitosa

    }

    //funcion q verfica si existe el material por id
    public static boolean existeId(String id) {

        // 1. Buscar en la lista general
        for (Material m : materiales) {
            if (m.id.equalsIgnoreCase(id)) {
                return true;
            }
        }

        // 2. Buscar en libros
        for (LibroElectronico l : libros) {
            if (l.id.equalsIgnoreCase(id)) {
                return true;
            }
        }

        // 3. Buscar en revistas
        for (Revista r : revistas) {
            if (r.id.equalsIgnoreCase(id)) {
                return true;
            }
        }

        // 4. Buscar en tesis
        for (Tesis t : tesis) {
            if (t.id.equalsIgnoreCase(id)) {
                return true;
            }
        }

        // Si no se encontró en ninguno
        return false;
    }

    //funcion q elimina un material por id
    public static boolean eliminarPorId(String id) {
        boolean eliminado = false;

        // 1. Eliminar de la lista general
        eliminado = materiales.removeIf(m -> m.id.equalsIgnoreCase(id)) || eliminado;

        // 2. Eliminar de libros
        eliminado = libros.removeIf(l -> l.id.equalsIgnoreCase(id)) || eliminado;

        // 3. Eliminar de revistas
        eliminado = revistas.removeIf(r -> r.id.equalsIgnoreCase(id)) || eliminado;

        // 4. Eliminar de tesis
        eliminado = tesis.removeIf(t -> t.id.equalsIgnoreCase(id)) || eliminado;

        return eliminado;
    }

    //Funcion para buscar
    public static ArrayList<Material> buscar(String categoria, String filtro, String dato) {

        ArrayList<Material> resultados = new ArrayList<>();

        for (Material m : Cargar_Elementos.materiales) {

            boolean coincideCategoria = false;

            // Comprobar categoría
            switch (categoria.toLowerCase()) {
                case "libro":
                    coincideCategoria = m instanceof LibroElectronico;
                    break;

                case "revista":
                    coincideCategoria = m instanceof Revista;
                    break;

                case "tesis":
                    coincideCategoria = m instanceof Tesis;
                    break;

                // Si NO coincide con ninguna categoría → buscar en todos
                default:
                    coincideCategoria = true;
            }

            if (!coincideCategoria) {
                continue;
            }

            // FILTRO
            switch (filtro) {

                case "Titulo":
                    if (m.titulo.toLowerCase().contains(dato.toLowerCase())) {
                        resultados.add(m);
                    }
                    break;

                case "Autor":
                    if (m.autor.toLowerCase().contains(dato.toLowerCase())) {
                        resultados.add(m);
                    }
                    break;

                case "Palabra":
                    if (m.buscarPorPalabraClave(dato)) {
                        resultados.add(m);
                    }
                    break;

                default:
                    System.out.println("Filtro no válido.");
            }
        }

        return resultados;
    }

}
