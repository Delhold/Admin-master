// Ubicación: modelo/Producto.java
package Models;

//ATRIBUTOS DE LA CLASE PRODUCTO
public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private String descripcion;

    // CONSTRUCTOR VACIO, UTIL PARA MAS TARDE
    public Producto() {
    }

    //CONSTRUCTOR PARA INICIACILAR PATAMATROS
    public Producto(int id, String nombre, String categoria, String descripcion) {
        //DIFERENCIAS ENTRE PARAMETROS DEL METODO  Y ATRIBUTOS UTILIZANDO EL THIS
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    // Métodos getter y setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para categoria
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Métodos getter y setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
