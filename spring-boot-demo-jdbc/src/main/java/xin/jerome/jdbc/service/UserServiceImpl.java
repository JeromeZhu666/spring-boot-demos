package xin.jerome.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import xin.jerome.jdbc.entity.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * {@link UserService}实现类
 *
 * @author Jerome Zhu
 * @since 2018.08.29 16:59
 */
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public Boolean saveUser(User user) {

        Boolean result = jdbcTemplate.execute("INSERT INTO user (username,password) VALUES(?,?)", new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                return ps.executeUpdate() > 0;
            }

        });

        return result;
    }
}
