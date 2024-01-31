package com.example.java_board.dto;

import com.example.java_board.entity.Board;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@AllArgsConstructor //모든 필드를 매개변수로
@NoArgsConstructor  //기본생성자
public class BoardDto {
    private Long id;
    private String boardWriter;
    private String boardPass;
    //제목
    private String boardTitle;
    //내용
    private String boardContents;
    //조회수
    private int boardHits;
    //등록시간
    private LocalDateTime boardCreatedTime;
    //수정시간
    private LocalDateTime boardUpdatedTime;

    public static BoardDto toBoardDto(Board board){
        BoardDto boardDto = new BoardDto();
        boardDto.setId(board.getId());
        boardDto.setBoardWriter(board.getBoardWrite());
        boardDto.setBoardPass(board.getBoardPass());
        boardDto.setBoardTitle (board.getBoardTitle());
        boardDto.setBoardContents(board.getBoardContents());
        boardDto.setBoardHits(board.getBoardHits());
        boardDto.setBoardCreatedTime(board.getCreatedTime());
        boardDto.setBoardUpdatedTime(board.getUpdatedTime());
        return boardDto;
    }
}
