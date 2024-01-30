package com.example.java_board.entity;

import com.example.java_board.dto.BoardDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board")
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 20, nullable = false)  //크기 20, NotNull지정
    private String boardWrite;
    @Column
    private String boardPass;
    @Column
    private String boardTitle;
    @Column(length = 500)
    private String boardContents;
    @Column
    private int boardHits;

    public static Board tosaveEntity(BoardDto boardDto) {
        Board board = new Board();
        board.setId(boardDto.getId());
        board.setBoardWrite(boardDto.getBoardWriter());
        board.setBoardContents(boardDto.getBoardContents());
        board.setBoardPass(boardDto.getBoardPass());
        board.setBoardHits(0);
        return board;
    }
}
