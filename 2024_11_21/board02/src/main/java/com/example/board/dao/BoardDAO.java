package com.example.board.dao;

import com.example.board.dto.BoardTO;
import com.example.board.mapper.BoardMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BoardDAO {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private BoardMapper boardMapper;

    public ArrayList<BoardTO> boardList() {
        ArrayList<BoardTO> lists = boardMapper.list(); // MyBatis Mapper 호출
        logger.info("logger :{} ", "데이터 개수 : " + lists.size());
        return lists;
    }

    public int boardWriteOk(BoardTO to) {
        // MyBatis Mapper를 사용하여 게시글 작성
        return boardMapper.write_ok(to); // MyBatis Mapper 호출
    }

    public BoardTO boardView(BoardTO to) {
        // 조회수 증가
        boardMapper.view_hit(to); // 조회수를 증가시키는 SQL 호출
        // 게시글 상세정보 조회
        return boardMapper.view(to); // MyBatis Mapper 호출
    }

    public BoardTO boardModify(BoardTO to) {
        return boardMapper.modify(to); // MyBatis Mapper 호출
    }

    public int boardModifyOK(BoardTO to) {
        return boardMapper.modify_ok(to); // MyBatis Mapper 호출
    }

    public BoardTO boardDelete(BoardTO to) {
        return boardMapper.delete(to); // MyBatis Mapper 호출
    }

    public int boardDeleteOK(BoardTO to) {
        return boardMapper.delete_ok(to); // MyBatis Mapper 호출
    }
}
