package gdsc.shine.springlearningsimple.dao;

import gdsc.shine.springlearningsimple.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAO {

    private JdbcTemplate jdbcTemplate;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //[2번 문제]
    public void insertUserByName(String userName) {
        String sql = "INSERT INTO users(name) VALUES(?)";
        jdbcTemplate.update(sql, userName);
    }

    //[2번 문제]
    public int countByUserName(String userName) {
        String sql = "SELECT COUNT(1) FROM users WHERE name = ?";
        try{
            return jdbcTemplate.queryForObject(sql, Integer.class, userName);
        }catch (EmptyResultDataAccessException e){
            return -1;
        }
    }
}