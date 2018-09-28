/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2bases;

import controladores.PedidosCRUD_Controlador;
import java.util.ArrayList;
import vistas.PedidosCRUD;

/**
 *
 * @author jose pablo
 */
public class Proyecto2Bases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PedidosCRUD_Controlador vista = new PedidosCRUD_Controlador(new PedidosCRUD(new ArrayList<String>()));
    }
    
}
