package io.github.adonogtx.springmvclab.product;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Product {
    private Long id;
    private Long storeId;
    private String name;
    private String nameJa;
    private String category;
    private int priceYen;
    private int stock;
}
