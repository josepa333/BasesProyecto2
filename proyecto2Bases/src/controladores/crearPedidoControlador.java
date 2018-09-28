/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.LineaPedido;
import modelo.Pedido;
import vistas.crearPedido;

/**
 *
 * @author jose pablo
 */
public class crearPedidoControlador implements ActionListener{

    private crearPedido vista;
    private Pedido pedido;
    private ArrayList<LineaPedido> lineas;

    
    public crearPedidoControlador(crearPedido vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        lineas = new ArrayList<>();
        this.vista.anadeLineaBT.addActionListener(this);
        this.vista.borrarLineaBT.addActionListener(this);
        this.vista.crearPedidoBT.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Agregar linea":
                JOptionPane.showMessageDialog(vista,"Agregar linea");
                anadeLinea();
                break;
            case "Borrar linea":
                JOptionPane.showMessageDialog(vista,"Borrar linea");
                borraLinea();
                break;
             case "Crear pedido":
                JOptionPane.showMessageDialog(vista,"Implementar Web service");
                break;
            default:
                JOptionPane.showMessageDialog(vista,"Ninguna de las opciones registradas");
                break;
        } 
    }
    
    
    private void anadeLinea(){
        String item = ""  +  (String) vista.prendaCB.getSelectedItem() + "    ";
        item +=  (String) vista.tallaCB.getSelectedItem() + "    ";
        item += Integer.toString((Integer) vista.cantidadSN.getValue());
        vista.listaLineas.add(item);
    }
    
    private void borraLinea(){
       int pos = vista.listaLineas.getSelectedIndex();
       vista.listaLineas.remove(pos); 
       lineas.remove(pos);
    }
}
