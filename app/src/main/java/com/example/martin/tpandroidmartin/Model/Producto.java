package com.example.martin.tpandroidmartin.Model;

import java.util.ArrayList;

/**
 * Created by USER on 2/5/2017.
 */

public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer cantidad;

    private static ArrayList<Producto> listaMenu;
    private static ArrayList<Producto> listaBebidas;
    private static ArrayList<Producto> listaSnacks;



    public Producto(String name, Double price, Integer cantidad){
        this.setNombre(name);
        this.setPrecio(price);
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static ArrayList<Producto> getStaticListMenus()
    {
        if(listaMenu == null)
        {
            listaMenu = new ArrayList<Producto>();
            listaMenu.add(new Producto("Pizza", 15.50,1));
            listaMenu.add(new Producto("Tostados",25.0,1));
            listaMenu.add(new Producto("Frutas",30.0,1));
            listaMenu.add(new Producto("Empanadas",15.0,1));
            listaMenu.add(new Producto("Hamburguesa",45.0,1));
        }
        return listaMenu;
    }
    public static ArrayList<Producto> getStaticListBebidas()
    {
        if(listaBebidas == null)
        {
            listaBebidas = new ArrayList<Producto>();
            listaBebidas.add(new Producto("Coca Cola", 15.50,1));
            listaBebidas.add(new Producto("Sprite",25.0,1));
            listaBebidas.add(new Producto("Agua Mineral",30.0,1));
            listaBebidas.add(new Producto("Pepsi",15.0,1));
            listaBebidas.add(new Producto("Gatorei",45.0,1));
        }
        return listaBebidas;
    }
    public static ArrayList<Producto> getStaticListSnacks()
    {
        if(listaSnacks == null)
        {
            listaSnacks = new ArrayList<Producto>();
            listaSnacks.add(new Producto("Lays", 15.50,1));
            listaSnacks.add(new Producto("Saladix",25.0,1));
            listaSnacks.add(new Producto("Cheetos",30.0,1 ));
            listaSnacks.add(new Producto("3D",15.0,1));
            listaSnacks.add(new Producto("Doritos",45.0,1));
        }
        return listaSnacks;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.hashCode() == obj.hashCode())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {

        int hash = 7;
        int resultado = 0;
        if(this.nombre != null)
        {    resultado = resultado + hash * this.nombre.hashCode();}
        resultado = resultado + hash * this.precio.hashCode();
        return resultado;


    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad += cantidad;
    }
}
