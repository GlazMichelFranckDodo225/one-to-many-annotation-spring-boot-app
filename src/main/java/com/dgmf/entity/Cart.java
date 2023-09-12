package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @Builder
@Table(name = "tbl_cart")
public class Cart {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*
    "@OneToMany" annotation is used to define the property
    in "Item" class that will be used to map the "mappedBy" variable.
    That is why we have a property named "cart" in the Item class.
    */
    @OneToMany(mappedBy = "cart")
    private List<Item> items;
}
