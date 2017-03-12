package com.cdkj.pipe.proxy;

public class ReflectUtil {

    public static Object getInstance(String classname) {
        Object result = null;
        try {
            Class cls = Class.forName(classname);
            if (cls != null) {
                result = cls.newInstance();// 被代理对象
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
