package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private int codigo;
    private String talla;
    private Categoria categoria;

    /**
     * metodo constructor de la clase producto
     * @param nombre
     * @param codigo
     * @param talla
     * @param categoria
     */

    

    public Producto(String nombre, int codigo, String talla, Categoria categoria) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.talla = talla;
        this.categoria= categoria;

    
    }

    /*
     * setter and guetters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", talla=" + talla + ", categoria=" + categoria
                + "]";
    }

    

}
