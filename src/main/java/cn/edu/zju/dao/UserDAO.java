package cn.edu.zju.dao;

import cn.edu.zju.entity.User;

/**
 * Created by succe on 2018/1/8.
 */
public interface UserDAO {
    /**
     * 增加一个用户
     *
     * @param user
     * @return
     */
    public Integer add(User user);

    /**
     * 删除一个用户
     *
     * @param user
     * @return
     */
    public Integer delete(User user);

    /**
     * 修改某个用户信息
     *
     * @param user
     * @return
     */
    public Integer modify(User user);

    /**
     * 通过用户名查找用户信息
     *
     * @param username
     * @return
     */
    public User findUserByName(String username);
}
