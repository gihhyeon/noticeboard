package com.codingrecipe.board.service;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository; // BoardRepository를 주입 받는다.

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }
}
