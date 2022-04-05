package com.sjport.portfolio_sj.service;

import com.sjport.portfolio_sj.entity.Item;
import com.sjport.portfolio_sj.exception.ResourceNotFoundException;
import com.sjport.portfolio_sj.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> itemList(){
        return itemRepository.findAll();
    }

    public Item createItem(@RequestBody Item item){
//        int nowStock = item.getItemStock();
//        nowStock += quantity;
//        item.setItemStock(nowStock);
        return itemRepository.save(item);
    }

    public ResponseEntity<Map<String, Boolean>> deleteItem(@PathVariable Long itemNo){
        Item item = itemRepository.findById(itemNo)
                .orElseThrow(() -> new ResourceNotFoundException("Item not exist : " + itemNo));
        itemRepository.delete(item);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
