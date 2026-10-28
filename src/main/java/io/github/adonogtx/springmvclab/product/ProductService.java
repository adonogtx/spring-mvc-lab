package io.github.adonogtx.springmvclab.product;

import io.github.adonogtx.springmvclab.store.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final StoreService storeService;

    Optional<Product> findByStoreIdAndId(Long storeId, Long id) {
        return repository.findByStoreIdAndId(storeId, id);
    }

    Optional<List<Product>> findAll(Long storeId,
                                    String category,
                                    boolean inStock,
                                    int maxPriceYen,
                                    String sort) {

        if(storeService.findById(storeId).isEmpty()) {
            return Optional.empty();
        }

        List<Product> products = repository.findByStoreId(storeId);

        Comparator<Product> comparator;



        if (sort.equals("price")) {
            comparator = Comparator.comparing(Product::getPriceYen);
        }
        else {
            comparator = Comparator.comparing(Product::getName);
        }

        return Optional.of(products.stream()
                .filter(p -> category == null || p.getCategory().equals(category))
                .filter(p -> !inStock || p.getStock() > 0)
                .filter(p -> p.getPriceYen() <= maxPriceYen)
                .sorted(comparator)
                .toList());

    }


}
