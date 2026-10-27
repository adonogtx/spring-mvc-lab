package io.github.adonogtx.springmvclab.store;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StoreRepository {
    private final List<Store> stores = new ArrayList<>();

    {
        Store shinjuku = Store.builder()
                .id(1L)
                .name("Fuji Mart Shinjuku")
                .nameJa("フジマート新宿店")
                .city("Tokyo")
                .open24h(true)
                .build();
        Store shibuya = Store.builder()
                .id(2L)
                .name("Fuji Mart Shibuya")
                .nameJa("フジマート渋谷店")
                .city("Tokyo")
                .open24h(true)
                .build();
        Store kyoto = Store.builder()
                .id(3L)
                .name("Fuji Mart Kyoto Station")
                .nameJa("フジマート京都駅店")
                .city("Kyoto")
                .open24h(false)
                .build();

        stores.addAll(List.of(shinjuku,shibuya,kyoto));
    }

    List<Store> getStores() {
        return List.copyOf(stores);
    }
    
}
