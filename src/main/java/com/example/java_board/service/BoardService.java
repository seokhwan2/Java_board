package com.example.java_board.service;

import com.example.java_board.entity.Board;
import com.example.java_board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getAllBoards(){
        return boardRepository.findAll();
    }


    public Board createBoard(Board board){
        return boardRepository.save(board);
    }
}
