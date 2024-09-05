package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Inventario {

private String nombre;
  private Collection<Producto> listaProductos;
  private Collection<Proveedor> ListaProveedores;

  /*
   * metodo constructor de la clase inventario
   */

    public Inventario(){

        this.nombre=nombre;

        listaProductos = new LinkedList<>();
        ListaProveedores = new LinkedList<>();

    }

    // setters and guetters
    
    public String getNombre() {
        return nombre;
    }





    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }





    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


/*
 * metodo que permite agregar procuductos
 * 
 */


    public void agregarProducto(Producto producto){

        if(!verificarProducto(producto.getCodigo())){

            listaProductos.add(producto);
            System.out.println("el producto fue agregado");

        }
        else{

            System.out.println("El producto no puede ser agregado");
        }



    }

    /**
     * metodo para verificar producto
     * @param codigo
     * @return
     */

    public  boolean verificarProducto(int codigo){

        

            boolean centinela = false;
    
            for (Producto producto : listaProductos) {
                if (producto.getCodigo()==(codigo)) {
                    centinela = true;
                }
            }
            return centinela;
        }

    /**
     * metodo para eliminar producto
     * @param codigo
     */


       public void eliminarProducto(int codigo){

        for (Producto producto : listaProductos) {
            if (producto.getCodigo()==(codigo)) {
                listaProductos.remove(producto);
                System.out.println("El producto fue eliminado");
            }
            break;
        }

        /**
         * metodo para vender producto
         */

        }
        public void venderProducto(int codigo){

            for (Producto producto : listaProductos) {
                if(producto.getCodigo()==codigo){
                listaProductos.remove(producto);
                System.out.println("El producto fue vendido");
            }  
        }   

          }
          /**
           * metodo para ver la disponibilidad del producto
           * @param codigo
           */

        public void disponibilidadProducto(int codigo){

            for (Producto producto : listaProductos) {
                if(producto.getCodigo()==listaProductos.size()){
                    System.out.println("el producto esta disponible");
                }else{
                    System.out.println("el producto no esta disponible");
                }
            }

            

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
        return "Inventario [nombre=" + nombre + ", listaProductos=" + listaProductos + "]";
    }



       }

    


