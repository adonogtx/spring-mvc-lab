package io.github.adonogtx.springmvclab.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository repository;

    List<Store> findAll(){
        return repository.findAll();
    }

    Optional<Store> findById(Long id){
        return repository.findById(id);
    }
}
