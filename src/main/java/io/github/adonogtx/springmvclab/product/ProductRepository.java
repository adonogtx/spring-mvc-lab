package io.github.adonogtx.springmvclab.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    {
        var p1 = Product.builder()
                .id(101L)
                .storeId(1L)
                .name("Salmon Onigiri")
                .nameJa("おにぎり 鮭")
                .category("onigiri")
                .priceYen(160)
                .stock(24)
                .build();
        var p2 = Product.builder()
                .id(102L)
                .storeId(1L)
                .name("Tuna Mayo Onigiri")
                .nameJa("おにぎり ツナマヨ")
                .category("onigiri")
                .priceYen(150)
                .stock(3)
                .build();
        var p3 = Product.builder()
                .id(103L)
                .storeId(1L)
                .name("Karaage Bento")
                .nameJa("唐揚げ弁当")
                .category("bento")
                .priceYen(498)
                .stock(8)
                .build();
        var p4 = Product.builder()
                .id(104L)
                .storeId(1L)
                .name("Matcha Latte")
                .nameJa("抹茶ラテ")
                .category("drink")
                .priceYen(180)
                .stock(0)
                .build();
        var p5 = Product.builder()
                .id(105L)
                .storeId(1L)
                .name("Melon Pan")
                .nameJa("メロンパン")
                .category("bread")
                .priceYen(140)
                .stock(12)
                .build();

        var p6 = Product.builder()
                .id(201L)
                .storeId(2L)
                .name("Umeboshi Onigiri")
                .nameJa("おにぎり 梅")
                .category("onigiri")
                .priceYen(130)
                .stock(15)
                .build();
        var p7 = Product.builder()
                .id(202L)
                .storeId(2L)
                .name("Hamburg Bento")
                .nameJa("ハンバーグ弁当")
                .category("bento")
                .priceYen(550)
                .stock(6)
                .build();
        var p8 = Product.builder()
                .id(203L)
                .storeId(2L)
                .name("Green Tea")
                .nameJa("緑茶")
                .category("drink")
                .priceYen(140)
                .stock(30)
                .build();
        var p9 = Product.builder()
                .id(204L)
                .storeId(2L)
                .name("Curry Bread")
                .nameJa("カレーパン")
                .category("bread")
                .priceYen(170)
                .stock(4)
                .build();
        var p10 = Product.builder()
                .id(205L)
                .storeId(2L)
                .name("Rice Crackers")
                .nameJa("せんべい")
                .category("snack")
                .priceYen(165)
                .stock(20)
                .build();

        var p11 = Product.builder()
                .id(301L)
                .storeId(3L)
                .name("Kombu Onigiri")
                .nameJa("おにぎり 昆布")
                .category("onigiri")
                .priceYen(140)
                .stock(10)
                .build();

        var p12 = Product.builder()
                .id(302L)
                .storeId(3L)
                .name("Makunouchi Bento")
                .nameJa("幕の内弁当")
                .category("bento")
                .priceYen(650)
                .stock(2)
                .build();

        var p13 = Product.builder()
                .id(303L)
                .storeId(3L)
                .name("Hojicha")
                .nameJa("ほうじ茶")
                .category("drink")
                .priceYen(150)
                .stock(0)
                .build();

        var p14 = Product.builder()
                .id(304L)
                .storeId(3L)
                .name("Anpan")
                .nameJa("あんパン")
                .category("bread")
                .priceYen(130)
                .stock(9)
                .build();

        var p15 = Product.builder()
                .id(305L)
                .storeId(3L)
                .name("Yatsuhashi")
                .nameJa("八ツ橋")
                .category("snack")
                .priceYen(600)
                .stock(5)
                .build();

       products.addAll(List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));
    }

    List<Product> getProducts() {
        return List.copyOf(products);
    }
}
