package io.github.adonogtx.springmvclab.product;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class ProductGetResponse {
    private Long id;
    private Long storeId;
    private String name;
    private String nameJa;
    private String category;
    private int priceYen;
    private int stock;

    static ProductGetResponse toProductResponse(Product product) {
        return ProductGetResponse.builder()
                .id(product.getId())
                .storeId(product.getStoreId())
                .name(product.getName())
                .nameJa(product.getNameJa())
                .category(product.getCategory())
                .priceYen(product.getPriceYen())
                .stock(product.getStock())
                .build();
    }

    static List<ProductGetResponse> toProductResponseList(List<Product> product) {
        return product.stream().map(ProductGetResponse::toProductResponse).toList();
    }
}
