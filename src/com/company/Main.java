package com.company;

import com.company.tool.*;
import com.company.词法分析器.Lexical;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translater translater = new Translater();
        translater.init();
        String s = null;
        try {
            s = CFile.readProgram();
        } catch (IOException e) {
            System.out.println("读取文件失败！！！");
            e.printStackTrace();
        }
        Lexical lexical = new Lexical();
        lexical.lexicalAnalysis(s.toCharArray());
    }
}

class Translater{
    public void init(){
        //初始化关键字类表
        KeyWord keyWord = KeyWord.getInstance();
        keyWord.initKeyWordList();
        //初始化常数表
        Constant constant = Constant.getInstance();
        //初始化分隔符表
        Separator separator = Separator.getInstance();
        separator.initSeparator();
        //初始化变量名表
        VariableName variableName = VariableName.getInstance();
    }
}

