package com.Ecommerce.Ecommerce1.model;

import jakarta.persistence.*;
import lombok.Data;

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
    private Product product; //Multiple product might be there in a n order


}
