package xin.jerome.jdbc.service;

import xin.jerome.jdbc.entity.User;

/**
 * 用户业务逻辑接口
 *
 * @author Jerome Zhu
 * @since 2018.08.29 16:58
 */
public interface UserService {

    public Boolean saveUser(User user);

}
