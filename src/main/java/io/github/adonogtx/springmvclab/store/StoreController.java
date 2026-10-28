package io.github.adonogtx.springmvclab.store;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/stores")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService service;

    @GetMapping
    public ResponseEntity<List<StoreGetResponse>> findAll(){

        var foundStores = service.findAll();

        var responses = foundStores.stream()
                .map(StoreGetResponse::toStoreGetResponse)
                .toList();

        return  ResponseEntity.ok(responses);
    }

    @GetMapping("/{storeId}")
    public ResponseEntity<StoreGetResponse> findById(@PathVariable Long storeId){

       return service.findById(storeId)
                .map(StoreGetResponse::toStoreGetResponse)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
