package Base_de_Datos;
//@Autor Cesar
import Libreria.Cargar_Elementos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Types;
import Libreria.*;
import static Libreria.Cargar_Elementos.usuarios;
import java.util.ArrayList;

public class Funciones_BD {

    // Funcion q llama a un funcion de la base de datos para insertar material
    public String insertarMaterial(String id, String titulo, String autor, String descripcion, int anio, String extra1, String extra2, String clasificacion, String disponibilidad) {
        String resultado = "";

        try (Connection conn = ConnectionFactory.getConnection()) {

            CallableStatement cs = conn.prepareCall("{CALL SP_InsertarMaterial(?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, id);
            cs.setString(2, titulo);
            cs.setString(3, autor);
            cs.setString(4, descripcion);
            cs.setInt(5, anio);
            cs.setString(6, extra1);
            cs.setString(7, extra2);
            cs.setString(8, clasificacion);
            cs.setString(9, disponibilidad);

            cs.registerOutParameter(10, Types.VARCHAR);

            cs.execute();
            resultado = cs.getString(10);

        } catch (Exception e) {
            resultado = "ERROR AL EJECUTAR: " + e.getMessage();
        }

        return resultado;
    }

    //funcion q llama a la funcion de la base de datos para insertar un prestamo
    public String InsertarPrestamo(String Libroid, String Nombre, String apellido, String Dni) {
        String resultado = "";

        try (Connection conn = ConnectionFactory.getConnection()) {

            CallableStatement cs = conn.prepareCall("{CALL SP_PrestarMaterial(?,?,?,?,?)}");

            // Parámetros de entrada
            cs.setString(1, Libroid);
            cs.setString(2, Nombre);
            cs.setString(3, apellido);
            cs.setString(4, Dni);

            // Parámetro de salida (posición 5)
            cs.registerOutParameter(5, Types.VARCHAR);

            // Ejecutar el SP
            cs.execute();

            // Obtener resultado
            resultado = cs.getString(5);

        } catch (Exception e) {
            resultado = "ERROR AL EJECUTAR: " + e.getMessage();
        }

        return resultado;
    }

    //funcion q llama a la fucnion de la base de datos para actualizar algun dato por id 
    public String Actualizar(String id, String titulo, String autor, String descripcion, int anio, String extra1, String extra2, String clasificacion, String disponibilidad) {
        String resultado = "";

        try (Connection conn = ConnectionFactory.getConnection()) {

            CallableStatement cs = conn.prepareCall("{CALL SP_ActualizarMaterial(?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, id);
            cs.setString(2, titulo);
            cs.setString(3, autor);
            cs.setString(4, descripcion);
            cs.setInt(5, anio);
            cs.setString(6, extra1);
            cs.setString(7, extra2);
            cs.setString(8, clasificacion);
            cs.setString(9, disponibilidad);

            cs.registerOutParameter(10, Types.VARCHAR);

            cs.execute();
            resultado = cs.getString(10);

        } catch (Exception e) {
            resultado = "ERROR AL EJECUTAR: " + e.getMessage();
        }

        return resultado;
    }

    //funcion q llama a la funcion de la base de datos para eliminar un material por id
    public String eliminarMaterial(String id) {
        String resultado = "";

        try (Connection conn = ConnectionFactory.getConnection()) {

            // El SP tiene 2 parámetros: ID y Resultado(OUTPUT)
            CallableStatement cs = conn.prepareCall("{CALL SP_EliminarMaterial(?, ?)}");

            // 1. Parámetro de entrada: ID
            cs.setString(1, id);

            // 2. Parámetro de salida: Resultado
            cs.registerOutParameter(2, Types.VARCHAR);

            cs.execute();

            resultado = cs.getString(2);

        } catch (Exception e) {
            resultado = "ERROR AL EJECUTAR: " + e.getMessage();
        }

        return resultado;
    }

    public String DevolverMaterial(String id) {
        String resultado = "";

        try (Connection conn = ConnectionFactory.getConnection()) {

            CallableStatement cs = conn.prepareCall("{CALL SP_DevolverMaterial(?, ?)}");

            // Convertir el ID a entero
            int idInt = Integer.parseInt(id); // <--- aquí

            cs.setInt(1, idInt); // usar setInt

            cs.registerOutParameter(2, Types.VARCHAR);

            cs.execute();

            resultado = cs.getString(2);

        } catch (NumberFormatException nfe) {
            resultado = "ERROR: El ID debe ser un número.";
        } catch (Exception e) {
            resultado = "ERROR AL EJECUTAR: " + e.getMessage();
        }

        return resultado;
    }

    public String InsertarUsuario(String nombre, String apellido, String dni) {
        String resultado = "";

        try (Connection conn = ConnectionFactory.getConnection()) {

            CallableStatement cs = conn.prepareCall("{CALL SP_CrearUsuario(?,?,?,?)}");

            cs.setString(1, nombre);
            cs.setString(2, apellido);
            cs.setString(3, dni);

            cs.registerOutParameter(4, Types.VARCHAR);

            cs.execute();
            resultado = cs.getString(4);

        } catch (Exception e) {
            resultado = "ERROR AL EJECUTAR: " + e.getMessage();
        }

        return resultado;
    }

    //funcion para llenar de materiales con los datos de la base de datos en los arrays del programa 
    public static String cargarMaterialesDesdeBD() {
        
        
        String resultado = "OK";

        // Limpiar listas primero
        Cargar_Elementos.materiales.clear();
        Cargar_Elementos.libros.clear();
        Cargar_Elementos.revistas.clear();
        Cargar_Elementos.tesis.clear();

        String query = "SELECT ID, Titulo, Autor, Descripcion, Anio, Extra1, Extra2, Clasificacion, Disponibilidad "
                + "FROM Material";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(query); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String id = rs.getString("ID");
                String titulo = rs.getString("Titulo");
                String autor = rs.getString("Autor");
                String descripcion = rs.getString("Descripcion");
                String anio = String.valueOf(rs.getInt("Anio"));
                String extra1 = rs.getString("Extra1");
                String extra2 = rs.getString("Extra2");
                String clasificacion = rs.getString("Clasificacion");
                String disponibilidadStr = rs.getString("Disponibilidad");

                // Normalizar y convertir a boolean:
                boolean disponible = disponibilidadStr != null
                        && disponibilidadStr.trim().equalsIgnoreCase("Disponible");
                // (si tienes variantes como "No Disponible", "no disponible", ok: lo anterior devolverá false)

                Cargar_Elementos.crearMaterial(
                        clasificacion,
                        id,
                        titulo,
                        descripcion,
                        autor,
                        anio,
                        extra1,
                        extra2,
                        disponible // <-- pasamos la disponibilidad
                );
            }

        } catch (Exception e) {
            resultado = "ERROR al cargar materiales: " + e.getMessage();
        }

        return resultado;
    }

    public static String cargarPrestamosDesdeBD() {

        String resultado = "OK";

        // Limpiar HashMap antes de cargar
        Cargar_Elementos.prestamos.clear();

        String query = "SELECT ID, MaterialID, UsuarioID, FechaPrestamo, FechaDevolucion FROM Prestamos";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(query); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String id = rs.getString("ID"); // clave del hashmap
                String idLibro = rs.getString("MaterialID");
                String idUsuario = rs.getString("UsuarioID");

                // Convertir fechas a String para evitar líos con java.sql.Date
                String fechaInicio = rs.getString("FechaPrestamo");
                String fechaFin = rs.getString("FechaDevolucion");

                // Crear lista con los datos
                ArrayList<String> datos = new ArrayList<>();
                datos.add(idLibro);
                datos.add(idUsuario);
                datos.add(fechaInicio);
                datos.add(fechaFin);

                // Guardar en el HashMap
                Cargar_Elementos.prestamos.put(id, datos);
            }

        } catch (Exception e) {
            return "ERROR al cargar préstamos: " + e.getMessage();
        }

        return resultado;
    }

    public static String cargarUsuariosDesdeBD() {
        usuarios.clear();

        String sql = "SELECT ID, Nombre, Apellido, DNI FROM Usuarios";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String id = rs.getString("ID");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                String dni = rs.getString("DNI");

                usuarios.put(id, new Usuario(id, nombre, apellido, dni));
            }

        } catch (Exception e) {
            return "ERROR usuarios: " + e.getMessage();
        }

        return "OK";
    }

    public void actu(){
        cargarMaterialesDesdeBD();
        cargarPrestamosDesdeBD();
        cargarUsuariosDesdeBD();
    }
    
}
