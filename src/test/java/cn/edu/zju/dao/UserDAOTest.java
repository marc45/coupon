package cn.edu.zju.dao;

import cn.edu.zju.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by succe on 2018/1/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDAOTest {

    @Resource
    private UserDAO userDAO;

    @Test
    public void testAdd() throws Exception {
        User user = new User();
        user.setUsername("hou");
        user.setPassword("123456");
        int result = userDAO.add(user);
        org.junit.Assert.assertEquals(1, result);
    }

    @Test
    public void testDelete() throws Exception {
        User user = userDAO.findUserByName("hou");
        int result = userDAO.delete(user);
        org.junit.Assert.assertEquals(1, result);
    }

    @Test
    public void testModify() throws Exception {
        User user = userDAO.findUserByName("hou");
        user.setUsername("houyr");
        user.setPassword("123");
        int result = userDAO.modify(user);
        org.junit.Assert.assertEquals(1, result);
    }

    @Test
    public void testFindUserByName() throws Exception {
        User user = userDAO.findUserByName("hou");
        org.junit.Assert.assertNotNull(user);
    }
}