package cn.edu.zju.util;

import cn.edu.zju.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by succe on 2018/1/6.
 */
public class JsonUtilTest {

    Logger logger = Logger.getLogger(JsonUtilTest.class);

    @Test
    public void toJson() throws Exception {
        User user = new User("xiaoming", "123456");

        logger.info(JsonUtil.toJson(user));
    }

}