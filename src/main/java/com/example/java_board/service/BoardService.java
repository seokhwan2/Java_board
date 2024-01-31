package com.example.java_board.service;

import com.example.java_board.dto.BoardDto;
import com.example.java_board.entity.Board;
import com.example.java_board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// DTO를 Entity로 변환하거나 그 반대이거나
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public void save(BoardDto boardDto){
        Board board = Board.tosaveEntity(boardDto);
        boardRepository.save(board);

    }

    //Entity로 넘어온 값을 Dto에 담아서 컨트롤러로 return해줘야함
    public List<BoardDto> findAll() {
        List<Board> boardList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();
        for (Board board: boardList) {
            boardDtoList.add(BoardDto.toBoardDto(board));
        }
        return boardDtoList;

    }

}