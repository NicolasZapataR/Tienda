package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
    // comentar todas las pruebas menos la que desea ejecutar

   // prueba1();
    //prueba2();
    pruebaGeneral();
  //  pruebaMenu();
}

/**
 * caso de prueba, agregar producto
 */

    public static void prueba1() {

        Inventario inventario1 = new Inventario();

        Producto producto1 = new Producto("camisaPolo", 001, "S", Categoria.CAMISETA);
        Producto producto2 = new Producto("camisaPlayera", 002, "M", Categoria.CAMISETA);
        Producto producto3 = new Producto("jeanRotos", 003, "34", Categoria.PANTALON);
        Producto producto4 = new Producto("jeanMochos", 004, "30", Categoria.PANTALON);

        inventario1.agregarProducto(producto1);
        inventario1.agregarProducto(producto2);
        inventario1.agregarProducto(producto3);
        inventario1.agregarProducto(producto4);

        System.out.println(" este es el inventario de la tienda " + inventario1.toString());

    }

    /*
     * caso de prueba, eliminar producto
     * 
     */
    public static void prueba2() {

        Scanner dato = new Scanner(System.in);

        Inventario inventario1 = new Inventario();

        Producto producto1 = new Producto("camisaPolo", 001, "S", Categoria.CAMISETA);
        Producto producto2 = new Producto("camisaPlayera", 002, "M", Categoria.CAMISETA);
        Producto producto3 = new Producto("jeanRotos", 003, "34", Categoria.PANTALON);
        Producto producto4 = new Producto("jeanMochos", 004, "30", Categoria.PANTALON);

        inventario1.agregarProducto(producto1);
        inventario1.agregarProducto(producto2);
        inventario1.agregarProducto(producto3);
        inventario1.agregarProducto(producto4);

        System.out.println(" este es el inventario de la tienda" + inventario1.toString());

        System.out.println("ingrese el codigo del producto que desea eliminar");
        int codigo = dato.nextInt();

        inventario1.eliminarProducto(codigo);

        System.out.println("este es el inventario actual" + inventario1.toString());

    }

    /*
     * caso de prueba ejecucion con condicional if
     */


    public static void pruebaGeneral(){

        Scanner dato = new Scanner(System.in);


        Inventario inventario1 = new Inventario();
         

        Proveedor provedorCamisas = new Proveedor("Raul", 1212, "centro Armenia");
        Proveedor provedorPantalon = new Proveedor("Sofia", 2345, "centro Cali");
        Proveedor provedorZapatos = new Proveedor("yimy", 4567, "puerto buenaventura");
        Proveedor provedorChaquetas = new Proveedor("Laura", 6789, "MAnizles");

        inventario1.agregarProvedor(provedorCamisas);
        inventario1.agregarProvedor(provedorPantalon);
        inventario1.agregarProvedor(provedorZapatos);
        inventario1.agregarProvedor(provedorChaquetas);

            

        Producto producto1 = new Producto("camisaPolo", 001, "S", Categoria.CAMISETA);
        Producto producto2 = new Producto("camisaPlayera", 002, "M", Categoria.CAMISETA);
        Producto producto3 = new Producto("jeanRotos", 003, "34", Categoria.PANTALON);
        Producto producto4 = new Producto("jeanMochos", 004, "30", Categoria.PANTALON);

        
        inventario1.agregarProducto(producto1);
        inventario1.agregarProducto(producto2);
        inventario1.agregarProducto(producto3);
        inventario1.agregarProducto(producto4);


       

        System.out.println("1)vender  2)ver inverntario 3) agregar producto 4)eliminar producto 5)buscar proveedor");
        int opcion= dato.nextInt();

        if(opcion==1){

        System.out.println("ingrese el codigo del producto que desea eliminar");
        int codigo = dato.nextInt();

        inventario1.eliminarProducto(codigo);

        }

        if(opcion==2){

            System.out.println(inventario1.toString());    
        
        }

        if(opcion==3){

            System.out.println("ingrese el nombre de la producto");
            String nombre=dato.nextLine();
        
            System.out.println("ingrese el codigo de ld porducto");
            int codigo=dato.nextInt();
        
            System.out.println("ingrese la talla de la producto");
            String talla=dato.nextLine();
        
            System.out.println("ingrese la categoria del producto");
            String categoria=dato.nextLine();
        
            Producto producto= new Producto(nombre, codigo, talla, null);
        
            inventario1.agregarProducto(producto);

            System.out.println("el producto fue agregado");

        }

        if(opcion== 4){

        System.out.println("ingrese el codigo del producto que desea eliminar");
        int codigo = dato.nextInt();

        inventario1.eliminarProducto(codigo);

        }
        if(opcion==5){
            System.out.println("los provedores son " + "Proveedor.toString");
        }

            
        }

    /*
     * 
     * caso de prueba, ejecutar menu con while
     */


        public static void pruebaMenu(){

        Scanner dato = new Scanner(System.in);


        Inventario inventario1 = new Inventario();
         

        Proveedor provedorCamisas = new Proveedor("Raul", 1212, "centro Armenia");
        Proveedor provedorPantalon = new Proveedor("Sofia", 2345, "centro Cali");
        Proveedor provedorZapatos = new Proveedor("yimy", 4567, "puerto buenaventura");
        Proveedor provedorChaquetas = new Proveedor("Laura", 6789, "MAnizles");

        inventario1.agregarProvedor(provedorCamisas);
        inventario1.agregarProvedor(provedorPantalon);
        inventario1.agregarProvedor(provedorZapatos);
        inventario1.agregarProvedor(provedorChaquetas);

            

        Producto producto1 = new Producto("camisaPolo", 001, "S", Categoria.CAMISETA);
        Producto producto2 = new Producto("camisaPlayera", 002, "M", Categoria.CAMISETA);
        Producto producto3 = new Producto("jeanRotos", 003, "34", Categoria.PANTALON);
        Producto producto4 = new Producto("jeanMochos", 004, "30", Categoria.PANTALON);

        
        inventario1.agregarProducto(producto1);
        inventario1.agregarProducto(producto2);
        inventario1.agregarProducto(producto3);
        inventario1.agregarProducto(producto4);





        boolean centinela = true;

         while (centinela) {

            
            System.out.println("Por favor ingrese la operacion que desea realizar:");
            System.out.println("1. vender");
            System.out.println("2. ver inventario");
            System.out.println("3. agregar producto");
            System.out.println("4. eliminar producto");
            System.out.println("5.buscar proveedor");
            System.out.println("6. ver disponibilidad");
            System.out.println("7. Salir");
            int operacion = dato.nextInt();

            if (operacion==1) {
                System.out.println("ingrese el codigo del producto que desea vender");
                int cod = dato.nextInt();

              inventario1.eliminarProducto(cod);

            if (operacion==2){

                System.out.println(inventario1.toString());

            } 
            
            if (operacion==3){

            System.out.println("ingrese el nombre de la producto");
            String nombre=dato.nextLine();
        
            System.out.println("ingrese el codigo de ld porducto");
            int codigo=dato.nextInt();
        
            System.out.println("ingrese la talla de la producto");
            String talla=dato.nextLine();
        
            System.out.println("ingrese la categoria del producto");
            String categoria=dato.nextLine();
        
            Producto producto= new Producto(nombre, codigo, talla, null);
        
            inventario1.agregarProducto(producto);

            System.out.println("el producto fue agregado");

            }

            if(operacion==4){
                System.out.println("ingrese el codigo del producto que desea eliminar");
        int codigo = dato.nextInt();

        inventario1.eliminarProducto(codigo);

            }
            if (operacion==5){

                System.out.println("los provedores son " + "Proveedor.toString");
        }

            }
            if( operacion==6){
                System.out.println("ingrese el codigo del producto que desea verificar");
               int codigo = dato.nextInt();

               inventario1.disponibilidadProducto(codigo);

            }
            if(operacion==7){
                centinela=false;
                System.out.println("fin programa");
            }
        }
    }



        }


    
