package com.example.java_board.controller;

import com.example.java_board.dto.BoardDto;
import com.example.java_board.service.BoardService;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDto boardDto) {
        System.out.println("boardDTO = " + boardDto);
        boardService.save(boardDto);
        return "index";
    }
}