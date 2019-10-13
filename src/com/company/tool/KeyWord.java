package com.company.tool;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 关键字(保留字)类 一词一类
 * 一词一类 共32个
 * 类型为1
 */
public class KeyWord {
    public  static ArrayList<String> keyWordList= new ArrayList<>();
    private static KeyWord keyWord;

    public static KeyWord getInstance(){
        if(keyWord == null){
            synchronized (KeyWord.class){
                if(keyWord == null){
                    keyWord = new KeyWord();
                }
            }
        }
        return keyWord;
    }

    public void initKeyWordList(){
        //数据类型关键字
        keyWordList.add("char");
        keyWordList.add("double");
        keyWordList.add("enum");
        keyWordList.add("float");
        keyWordList.add("int");
        keyWordList.add("long");
        keyWordList.add("short");
        keyWordList.add("signed");
        keyWordList.add("struct");
        keyWordList.add("union");
        keyWordList.add("unsigned");
        keyWordList.add("void");
        //控制语句关键字
        keyWordList.add("for");
        keyWordList.add("do");
        keyWordList.add("while");
        keyWordList.add("break");
        keyWordList.add("continue");
        keyWordList.add("if");
        keyWordList.add("else");
        keyWordList.add("goto");
        keyWordList.add("switch");
        keyWordList.add("case");
        keyWordList.add("default");
        keyWordList.add("return");
        //存储类型关键字
        keyWordList.add("auto");
        keyWordList.add("extern");
        keyWordList.add("register");
        keyWordList.add("static");
        //其他关键字
        keyWordList.add("const");
        keyWordList.add("sizeof");
        keyWordList.add("typeof");
        keyWordList.add("volatile");
    }

    public void createHashMap(){
        HashMap<String,Integer> map = new HashMap<>();
    }
}
