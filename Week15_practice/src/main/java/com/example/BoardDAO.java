package com.example;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public List<BoardVO> getBoardList() {
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }

}
