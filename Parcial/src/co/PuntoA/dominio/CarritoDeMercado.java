package co.PuntoA.dominio;

import java.util.List;

public class CarritoDeMercado {
    public static final byte CAPACIDAD_MAXIMA = 20;
    private String supermercado;
    private List<Producto> productos;

    public boolean  agregar(Producto p){
        if(p != null){
            if (this.productos.size()<CAPACIDAD_MAXIMA){
               productos.add(p);
                return true;
            }

        }return false;

    }
    public Producto buscar(String nombre){
        Producto productoABuscar = null;
        for (Producto recorrerProductos:this.productos) {
            if (recorrerProductos.getNombre().equalsIgnoreCase(nombre)){
                productoABuscar = recorrerProductos;
                break;
            }
            
        }
        return productoABuscar;


    }
    public List<Producto> buscarPorTipo(String tipo){
        Producto buscarPorTipo = null;
        for (Producto tipoProducto:productos) {
            if (tipoProducto.getTipo().equalsIgnoreCase(tipo)){
                buscarPorTipo = tipoProducto;
                break;
            }
            
        }
        return productos;


    }
    public boolean sacar(String nombre){
        Producto productoSacar = buscar(nombre);
        if(productoSacar !=null){
            this.productos.remove(productoSacar);
            return true;

        }
        return false;

    }
    public  int calcularValorTotal(){
        int valorTotal = 0;
        for (int i=0 < productos.size();i++){
            valorTotal=productos.get(i).getPrecio()+valorTotal
        }



    }
    public  Producto obtenerProductoMasCaro(){

    }

    public String getSupermercado() {
        return supermercado;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }
}
