/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jose pablo
 */
public class LineaPedido {
        private int idLineaSolicitud;
        private int  idSolicitud;
        private int idPrenda;
        private int idTalla;
        private int cantidad;
        private int idOrdenProduccion;

    public LineaPedido(int idLineaSolicitud, int idSolicitud, int idPrenda, int idTalla, int cantidad, int idOrdenProduccion) {
        this.idLineaSolicitud = idLineaSolicitud;
        this.idSolicitud = idSolicitud;
        this.idPrenda = idPrenda;
        this.idTalla = idTalla;
        this.cantidad = cantidad;
        this.idOrdenProduccion = idOrdenProduccion;
    }
    
    public int getIdLineaSolicitud() {
        return idLineaSolicitud;
    }

    public void setIdLineaSolicitud(int idLineaSolicitud) {
        this.idLineaSolicitud = idLineaSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdOrdenProduccion() {
        return idOrdenProduccion;
    }

    public void setIdOrdenProduccion(int idOrdenProduccion) {
        this.idOrdenProduccion = idOrdenProduccion;
    }
}





















