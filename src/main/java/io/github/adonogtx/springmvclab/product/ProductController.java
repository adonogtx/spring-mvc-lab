package io.github.adonogtx.springmvclab.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
