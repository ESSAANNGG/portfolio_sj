package com.sjport.portfolio_sj.service;

import com.sjport.portfolio_sj.entity.Item;
import com.sjport.portfolio_sj.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> itemList(){
        return itemRepository.findAll();
    }

    public Item createItem(@RequestBody Item item){
        int a = item.getItemStock();
        return itemRepository.save(item);
    }
}
