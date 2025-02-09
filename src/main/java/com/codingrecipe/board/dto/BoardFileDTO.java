package com.codingrecipe.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardFileDTO {

    private Long id;
    private Long boardId;
    private String originalFileName; // 원본 파일 네임
    private String storedFileName; // 저장을 위한 파일 네임
}
