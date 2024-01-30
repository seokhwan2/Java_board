package com.example.java_board.controller;

import com.example.java_board.entity.Board;
import com.example.java_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }

    @PostMapping("/create")
    public Board createBoard(@RequestBody Board board) {
        return boardService.createBoard(board);
    }

}
