package com.Ecommerce.Ecommerce1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double totalAmount;

    @ManyToOne
    private User user; //one user can have multiple order

    @OneToMany
    private List<Product> products;; //Multiple product might be there in an order


}
