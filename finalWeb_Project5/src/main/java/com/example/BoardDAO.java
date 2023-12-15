package com.example;

import com.example.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo){
        int result = sqlSession.insert("Board.insertBoard", vo);
        return result;
    }

    public int deleteBoard(int CatID){
        return sqlSession.delete("Board.deleteBoard", CatID);
    }

    public int updateBoard(BoardVO vo){
        return sqlSession.update("Board.updateBoard", vo);
    }
    public BoardVO getBoard(int CatID){
        BoardVO one = sqlSession.selectOne("Board.getBoard", CatID);
        return one;
    }
    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
}