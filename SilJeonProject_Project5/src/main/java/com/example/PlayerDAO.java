package com.example;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertPlayer(PlayerVO vo){
        int result = sqlSession.insert("Player.insertPlayer",vo);
        return result;
    }

    public List<PlayerVO> getBoardList() {
        List<PlayerVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public int insertBoard(BoardVO vo) {
//        String sql = "insert into BOARD2 (title, writer, content, cnt) values (" + "'" + vo.getTitle() + "', " + "'" + vo.getWriter() + "', " +  "'" + vo.getContent() + "', " +"'" + vo.getCnt()  + "')";
//        return jdbcTemplate.update(sql);
//    }
//    public int deleteBoard(int seq) {
//        String sql = "delete from BOARD2 where seq = " + seq;
//        return jdbcTemplate.update(sql);
//    }
//
//    public int updateBoard(BoardVO vo) {
//        String sql = "update BOARD2 set title = '" + vo.getTitle() + "'," + "title='" + vo.getTitle() + "'," + "writer='" + vo.getWriter() + "', " + "content='" + vo.getContent() + "', "+ "cnt='" + vo.getCnt()  + "' where seq=" + vo.getSeq();
//        return jdbcTemplate.update(sql);
//    }
//
//    public BoardVO getBoard(int seq) {
//        String sql = "select * from BOARD2 where seq=" + seq;
//        return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
//    }
//
//    public List<BoardVO> getBoardList() {
//        String sql = "select * from BOARD2 order by seq asc ";
////        String sql = "select * from BOARD";
//        return jdbcTemplate.query(sql, new BoardRowMapper());
//    }
//
//    class BoardRowMapper implements RowMapper<BoardVO> {
//        @Override
//        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//            BoardVO vo = new BoardVO();
//            vo.setSeq(rs.getInt("seq"));
//            vo.setTitle(rs.getString("title"));
//            vo.setContent(rs.getString("content"));
//            vo.setWriter(rs.getString("writer"));
//            vo.setRegdate(rs.getDate("regdate"));
//            vo.setCnt(rs.getInt("cnt"));
//            return vo;
//        }
//    }


}
