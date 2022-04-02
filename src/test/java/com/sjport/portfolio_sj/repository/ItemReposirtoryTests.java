package com.sjport.portfolio_sj.repository;

import com.sjport.portfolio_sj.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class ItemReposirtoryTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void insertItemDummies(){
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Item item = Item.builder()
                    .itemName(".......ItemDummies")
                    .itemExplain("........ItemExplain")
                    .build();
            itemRepository.save(item);
        });
    }
}
