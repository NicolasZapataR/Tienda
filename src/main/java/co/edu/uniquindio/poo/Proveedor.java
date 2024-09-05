package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Proveedor {

    private String nombre;
    private int codigo;
    private String direccion;
    private Collection<Proveedor> ListaProveedores;
    

    
/**
 * metodo constructor de la clase  porveedor
 * @param nombre
 * @param codigo
 * @param direccion
 */
    public Proveedor(String nombre, int codigo, String direccion){

        this.nombre=nombre;
        this.codigo=codigo;
        this.direccion=direccion;
        ListaProveedores = new LinkedList<>();

        
    
    }

    // setters and guetters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Collection<Proveedor> getListaProveedores() {
        return ListaProveedores;
    }

    public void setListaProveedores(Collection<Proveedor> listaProveedores) {
        ListaProveedores = listaProveedores;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * metodo para agregar provedor
     * @param proveedor
     */

    public void agregarProvedor( Proveedor proveedor){

        ListaProveedores.add(proveedor);
        System.out.println("el provedor fue agregado");

    }

    @Override
    public String toString() {
        return "Proveedor [ListaProveedores=" + ListaProveedores + "]";
    }

   

    
    

   

   
    
    
}
