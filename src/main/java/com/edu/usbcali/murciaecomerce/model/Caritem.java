package com.edu.usbcali.murciaecomerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * Item del carrito de compras (relaciona usuario con producto)
 */
@Entity
@Table(name = "cart_items")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Caritem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Relación con User (muchos items -> un usuario)
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Relación con Product (muchos items -> un producto)
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

}
