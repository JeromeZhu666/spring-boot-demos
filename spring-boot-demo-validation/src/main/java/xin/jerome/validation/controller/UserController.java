package xin.jerome.validation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xin.jerome.validation.domain.User;

import javax.validation.Valid;

/**
 * 用户控制器
 *
 * @author Jerome Zhu
 * @since 2018.08.30 17:00
 */
@RestController
public class UserController {

    @PostMapping("/user")
    public User save(@Valid @RequestBody User user) {

        return user;
    }
}
