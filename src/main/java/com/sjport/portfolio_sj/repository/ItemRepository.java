package com.sjport.portfolio_sj.repository;

import com.sjport.portfolio_sj.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
