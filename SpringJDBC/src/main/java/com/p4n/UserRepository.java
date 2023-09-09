package com.p4n;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

public class UserRepository {
	private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public void createUser(String username, String email) {
//        String sql = "INSERT INTO emp (id, name,salary) VALUES (1,'omji',10000)";
//        jdbcTemplate.update(sql, username, email);
//    }
}
