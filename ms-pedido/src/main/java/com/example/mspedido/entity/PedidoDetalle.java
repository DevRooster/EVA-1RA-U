package com.example.mspedido.entity;

import com.example.mspedido.dto.ClienteDto;
import com.example.mspedido.dto.ProductoDto;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class PedidoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_producto;
    private Double  cantidad;
    private BigDecimal precioUnitario;

    private Double precio;
    private String descripcion;
    private Integer productoId;

    public PedidoDetalle() {
        this.cantidad = (double) 0;
        this.precio = (double) 0;
    }

    @Transient
    private ProductoDto productoDto ;
}
