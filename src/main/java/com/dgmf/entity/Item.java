package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_item")
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // This is the Foreign Key into the "Item" Entity referencing
    // the "id" of the "Cart" Entity
    /*
    It’s also important to note that the "@ManyToOne" annotation
    is associated with the "Cart" class variable.
    "@JoinColumn" annotation references the mapped column.
    */
    @ManyToOne
    // To give a useful name to the "Foreign Key" field
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;
}
