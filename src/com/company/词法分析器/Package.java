package com.company.词法分析器;

public class Package {
    public enum TYPE_OF_DATA{
        KEY_WORD,//关键字
        CONSTANTS,//常数
        SEPARATOR,//分隔符
        VARIABLE_NAME //变量名
    }

    public static TYPE_OF_DATA[] types = new TYPE_OF_DATA[]{TYPE_OF_DATA.KEY_WORD,
    TYPE_OF_DATA.CONSTANTS,TYPE_OF_DATA.SEPARATOR,TYPE_OF_DATA.VARIABLE_NAME};
}
