package com.sjport.portfolio_sj.service;

import com.sjport.portfolio_sj.entity.Board;
import com.sjport.portfolio_sj.exception.ResourceNotFoundException;
import com.sjport.portfolio_sj.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardrepository;

    //리스트
    public List<Board> boardlist(){
        return boardrepository.findAll();
    }

    //Create
    public Board createBoard(@RequestBody Board board){
        return boardrepository.save(board);
    }

    //update
    public ResponseEntity<Board> updateBoard(@PathVariable Long gno, @RequestBody Board boardDetails){
        Board board = boardrepository.findById(gno)
                .orElseThrow(() -> new ResourceNotFoundException("Board not exist with id :" + gno));
        board.setTitle(boardDetails.getTitle());
        board.setContent(boardDetails.getContent());

        Board updateBoard = boardrepository.save(board);
        return ResponseEntity.ok(updateBoard);
    }
}
