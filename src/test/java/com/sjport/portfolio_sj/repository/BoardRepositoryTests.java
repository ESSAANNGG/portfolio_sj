package com.sjport.portfolio_sj.repository;

import com.sjport.portfolio_sj.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertDummies(){
        IntStream.rangeClosed(1,100).forEach(i -> {
            Board board = Board.builder()
                    .title(".....TitleDummise" + i)
                    .content(".....contentDummise" + i)
                    .writer(".....writerDummise" + i)
                    .build();
            System.out.println(boardRepository.save(board));
        });
    }
}
