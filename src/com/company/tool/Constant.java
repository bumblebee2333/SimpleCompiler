package com.company.tool;

import java.util.ArrayList;

/**
 * 常数一类 在读代码的时候创建
 * 类别为2
 */
public class Constant {
    private static ArrayList<Integer> constantList = new ArrayList<>();
    private static Constant constant;

    public static Constant getInstance(){
        if(constant == null){
            synchronized (Constant.class){
                if(constant == null){
                    return new Constant();
                }
            }
        }
        return constant;
    }

    public void addIntegerIntoList(Integer integer){
        constantList.add(integer);
    }
}
