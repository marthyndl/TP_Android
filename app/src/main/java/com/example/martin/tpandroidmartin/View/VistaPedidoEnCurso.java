package com.example.martin.tpandroidmartin.View;

import com.example.user.tpandroidbuffetv12.activity.MenuActivity;
import com.example.user.tpandroidbuffetv12.model.Pedido;

/**
 * Created by USER on 3/5/2017.
 */

public class VistaPedidoEnCurso {

    private MenuActivity act;
    private Pedido ped;

    public VistaPedidoEnCurso(MenuActivity activity){
        this.act = activity;
        this.ped = new Pedido();
    }

}
