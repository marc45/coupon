package cn.edu.zju.util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by succe on 2018/1/6.
 */
public class JsonUtil {
    private static ObjectMapper mapper;
    static{
        mapper=new ObjectMapper();
    }
    public static String toJson(Object obj) throws IOException {
        String json = mapper.writeValueAsString(obj);
        return json;
    }
}
