package co.PuntoA.dominio;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private int precio;
    private String tipo;
    private List<Producto> productos=new ArrayList<>();


    public Producto(String nombre, int precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

}
