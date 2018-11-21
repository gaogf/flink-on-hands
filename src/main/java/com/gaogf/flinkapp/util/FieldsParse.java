package com.gaogf.flinkapp.util;

import java.lang.reflect.Field;

/**
 * @author Lenovo
 */
public class FieldsParse {

    public static String getFields(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        StringBuffer result = new StringBuffer();
        int length = fields.length;
        int num = 0;
        for (Field field:fields){
            result.append("\"" + field.toString().substring(field.toString().lastIndexOf(".") + 1) + "\"");
            num ++;
            if (num < length){
                result.append(",");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
/*        String fields = getFields(User.class);
        System.out.println(fields);*/
    }
}
