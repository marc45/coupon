package cn.edu.zju.result;

import java.io.Serializable;

/**
 * Created by succe on 2018/1/9.
 */
public class ReturnResult implements Serializable {

    private static final long serializableUID = 1L;

    // 0成功
    private int code;

    // 返回消息，成功为“success”，失败为具体失败信息
    private String message;

    // 返回数据
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
