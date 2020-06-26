package xin.jerome.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.jerome.jdbc.entity.User;
import xin.jerome.jdbc.service.UserService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * 控制器
 *
 * @author Jerome Zhu
 * @since 2018.08.29 16:53
 */
@RestController
public class JDBCController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Map<String, Object> getUser(@RequestParam(value = "id", defaultValue = "1")String id) {

        Map<String, Object> data = new HashMap<>();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE id =?");
            statement.setString(1,id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int key = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                data.put("id",key);
                data.put("username",username);
                data.put("password",password);

            }

        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }


        return data;
    }

    @PostMapping("/user")
    public Map<String, Object> addUser(@RequestBody User user) {
        Map<String, Object> data = new HashMap<>();

        Boolean result = userService.saveUser(user);
        data.put("success", result);

        return data;
    }

}
