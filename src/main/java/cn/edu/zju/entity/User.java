package cn.edu.zju.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by succe on 2018/1/6.
 */
public class User {

    Map<String, String> maps = new HashMap<String, String>();


    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        maps.put("111", "222");
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
