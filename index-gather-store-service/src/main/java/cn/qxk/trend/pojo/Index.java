package cn.qxk.trend.pojo;

import java.io.Serializable;

/**
 * @author laijianzhen
 * @date 2020/01/28
 */
public class Index implements Serializable {
    String code;
    String name;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
