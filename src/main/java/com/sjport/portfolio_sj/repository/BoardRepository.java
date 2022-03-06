package com.sjport.portfolio_sj.repository;

import com.sjport.portfolio_sj.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
