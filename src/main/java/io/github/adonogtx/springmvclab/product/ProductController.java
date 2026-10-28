package io.github.adonogtx.springmvclab.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/stores/{storeId}/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;


    @GetMapping("{productId}")
    ResponseEntity<ProductGetResponse> findByStoreIdAndId(@PathVariable Long storeId,
                                                          @PathVariable Long productId) {

        var byStoreIdAndId = service.findByStoreIdAndId(storeId, productId);

        return byStoreIdAndId
                .map(ProductGetResponse::toProductResponse)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    ResponseEntity<List<ProductGetResponse>> findAll(@PathVariable Long storeId,
                                                     @RequestParam(required = false) String category,
                                                     @RequestParam(required = false) boolean inStock,
                                                     @RequestParam int maxPriceYen,
                                                     @RequestParam(defaultValue = "name") String sort) {

        var products = service.findAll(storeId, category, inStock, maxPriceYen, sort);

        return products.map(ProductGetResponse::toProductResponseList)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
