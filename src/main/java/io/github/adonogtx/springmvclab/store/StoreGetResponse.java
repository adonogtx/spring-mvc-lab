package io.github.adonogtx.springmvclab.store;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StoreGetResponse {
    private Long id;
    private String name;
    private String nameJa;
    private String city;
    private boolean open24h;

   public static StoreGetResponse toStoreGetResponse(Store store){
       return StoreGetResponse.builder()
               .id(store.getId())
               .name(store.getName())
               .nameJa(store.getNameJa())
               .city(store.getCity())
               .open24h(store.isOpen24h())
               .build();
   }
}
