package io.github.adonogtx.springmvclab.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<Product> findAll() {
        return List.copyOf(repository.findAll());
    }

    Optional<Product> findByStoreIdAndId(Long storeId, Long id) {
        return repository.findByStoreIdAndId(storeId,id);
    }
}
