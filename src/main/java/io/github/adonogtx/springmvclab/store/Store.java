package io.github.adonogtx.springmvclab.store;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class Store {
    private Long id;
    private String name;
    private String nameJa;
    private String city;
    private boolean open24h;

}
