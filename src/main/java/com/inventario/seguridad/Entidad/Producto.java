package com.inventario.seguridad.Entidad;

import jakarta.persistence.*;
import lombok.Data;

@Data
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
}
