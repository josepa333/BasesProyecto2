/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Pedido;
import vistas.PedidosCRUD;
import vistas.TablaPedidos;
import vistas.crearPedido;

/**
 *
 * @author jose pablo
 */
public class PedidosCRUD_Controlador implements ActionListener,MouseListener {
    
    private PedidosCRUD vista;
    private Pedido modelo;
    public TablaPedidos tablaBase;

    public PedidosCRUD_Controlador(PedidosCRUD vista/*, Pedido modelo*/) {
        this.vista = vista;
        //this.modelo= modelo;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.crearNuevoPedido.addActionListener(this);
        this.vista.tablaPedidos.addMouseListener(this);
        tablaBase = new TablaPedidos();
        
    }
    
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()) {
            case "Crear nuevo pedido":
                JOptionPane.showMessageDialog(vista,"Crear nuevo pedido");
                crearPedidoControlador cpc = new crearPedidoControlador(new crearPedido());
                break;
            case "Anterior":
                JOptionPane.showMessageDialog(vista,"Anterior");
                break;
            case "Siguiente":
                JOptionPane.showMessageDialog(vista,"Siguente");
                break;
            case "Ultima":
                JOptionPane.showMessageDialog(vista,"Ultima");
                break;
           case "Primera":
                JOptionPane.showMessageDialog(vista,"Primera");
                break;
            default:
                break;
        } 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        int clic_tabla = vista.tablaPedidos.rowAtPoint(e.getPoint());

        int column  = vista.tablaPedidos.getColumnModel().getColumnIndexAtX(e.getX());
        int row = e.getY()/vista.tablaPedidos.getRowHeight();
        
        if(row < vista.tablaPedidos.getRowCount() && row >= 0 && column<vista.tablaPedidos.getColumnCount() &&
                column>=0){
            Object value  = vista.tablaPedidos.getValueAt(row,column);
            if(value instanceof JButton){
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                switch (column) {
                    case 4:
                        JOptionPane.showMessageDialog(vista,"Detalles");
                        break;
                    case 5:
                         JOptionPane.showMessageDialog(vista,"Editar");
                         break;
                    case 6:
                        if(JOptionPane.showConfirmDialog(vista, "¿Desea Eliminar?", "Mensaje", 1) == 0) {
                            JOptionPane.showMessageDialog(vista,"Borrar");
                        }
                        else
                            System.out.println("OK :)");
                        break;                        
                    default:
                        JOptionPane.showMessageDialog(vista, "Muy Bonita\nEspaciosa\nBarata", "Comentarios ", 1);
                        break;
                }
                System.out.println(row);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
   
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
