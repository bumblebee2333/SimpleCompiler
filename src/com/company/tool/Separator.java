package com.company.tool;

import java.util.ArrayList;

/**
 * 分隔符 一词一类
 * 空格 ，；[] {} "" ''
 */
public class Separator {
    public static ArrayList<Character> separatorList = new ArrayList<>();
    private static Separator separator;

    public static Separator getInstance(){
        if (separator == null){
            synchronized (Separator.class){
                if (separator == null){
                    separator = new Separator();
                }
            }
        }
        return separator;
    }

    public void initSeparator(){
        //separatorList.add(' ');
        separatorList.add(',');
        separatorList.add(';');
        separatorList.add(':');
        separatorList.add('[');
        separatorList.add(']');
        separatorList.add('{');
        separatorList.add('}');
        separatorList.add('+');
        separatorList.add('-');
        separatorList.add('*');
        separatorList.add('/');
        separatorList.add('"');
        separatorList.add('(');
        separatorList.add(')');
        separatorList.add('=');
    }
}
