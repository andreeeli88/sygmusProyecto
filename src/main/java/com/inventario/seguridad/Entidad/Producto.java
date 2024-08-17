package com.inventario.seguridad.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "productos_registro")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String producto;
    private String descripcion;
    private int stockInicial;
    private int entradas;
    private int factura;
    private int total;

    // Getters
    public Long getProductoId() {
        return productoId;
    }

    public String getProducto() {
        return producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public int getEntradas() {
        return entradas;
    }

    public int getFactura() {
        return factura;
    }

    public int getTotal() {
        return total;
    }

    // Setters
    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
