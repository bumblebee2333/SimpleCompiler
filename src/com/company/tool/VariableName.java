package com.company.tool;

import java.util.ArrayList;

/**
 * 变量名 在读程序的时候创建
 */

public class VariableName {
    private static ArrayList<String> variableNameList = new ArrayList<>();
    private static VariableName variableName;

    public static VariableName getInstance(){
        if(variableName == null){
            synchronized (VariableName.class){
                if (variableName == null){
                    variableName = new VariableName();
                }
            }
        }
        return variableName;
    }

    public void addVariableName(String variableName){
        variableNameList.add(variableName);
    }
}
