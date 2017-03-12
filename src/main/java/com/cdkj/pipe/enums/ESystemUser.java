/**
 * @Title EDirection.java 
 * @Package com.ibis.account.enums 
 * @Description 
 * @author miyb  
 * @date 2015-2-26 下午3:37:06 
 * @version V1.0   
 */
package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author: miyb 
 * @since: 2015-2-26 下午3:37:06 
 * @history:
 */
public enum ESystemUser {
    SYS_USER("SYS_ACCOUNT", "系统用户编号");

    public static Map<String, ESystemUser> getDirectionMap() {
        Map<String, ESystemUser> map = new HashMap<String, ESystemUser>();
        for (ESystemUser direction : ESystemUser.values()) {
            map.put(direction.getCode(), direction);
        }
        return map;
    }

    ESystemUser(String code, String value) {
        this.code = code;
        this.value = value;
    }

    private String code;

    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
