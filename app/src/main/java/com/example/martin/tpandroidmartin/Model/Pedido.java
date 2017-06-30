package com.example.martin.tpandroidmartin.Model;

import java.util.ArrayList;

/**
 * Created by USER on 3/5/2017.
 */

public class Pedido {
    private ArrayList<Producto> lista = new ArrayList<>();
    private Double total;


    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void add(Producto producto) {
        this.lista.add(producto);
        this.total = 0d;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
