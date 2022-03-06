package com.sjport.portfolio_sj.controller;

import com.sjport.portfolio_sj.entity.Board;
import com.sjport.portfolio_sj.repository.BoardRepository;
import com.sjport.portfolio_sj.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/boardList")
    public List<Board> boardList(){
        return boardService.boardlist();
    }

    @PostMapping("/createBoard")
    public Board createBoard(@RequestBody Board board){
        return boardService.createBoard(board);
    }

    @PutMapping("/updateBoard/{gno}")
    public Board updateBoard(){
        return null;
    }
}
