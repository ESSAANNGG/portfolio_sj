package com.sjport.portfolio_sj.controller;

import com.sjport.portfolio_sj.entity.Item;
import com.sjport.portfolio_sj.service.ItemService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public List<Item> itemList(){
        return itemService.itemList();
    }

    @PostMapping("/create")
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }
}
