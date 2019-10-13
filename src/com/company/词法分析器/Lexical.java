package com.company.词法分析器;

import com.company.tool.KeyWord;
import com.company.tool.Separator;

/**
 * 词法分析
 * 分为四大类分析 开头为
 * 字母 分为关键字和变量名
 * 数字
 * 分隔符
 */

public class Lexical {
    String str = new String();
    int quotes = 1;

    public void lexicalAnalysis(char[] program){
        for(int i=0;i<program.length;i++){
            if(i == program.length-1){
                break;
            }
            char ch = program[i];
            if(Character.isLowerCase(ch) || Character.isUpperCase(ch) ||
                    ch == '_' && Character.isLetter(program[i+1]) ||
                    ch == '_' && Character.isLetter(program[i-1])){
                str += ch;
                ch = program[++i];
                while (Character.isLetter(ch) || program[i] == '_'){
                    str += ch;
                    if(i == program.length-1)
                        break;
                    ch = program[++i];
                }
                --i;
                if(KeyWord.keyWordList.contains(str)){
                    print(str,Package.types[0].ordinal());
                }else {
                    print(str,Package.types[3].ordinal());
                }
            }else if(Character.isDigit(ch)){
                str += ch;
                ch = program[++i];
                while (Character.isDigit(ch)){
                    str += ch;
                    if(i == program.length-1)
                        break;
                    ch = program[++i];
                }
                --i;
                print(str,Package.types[1].ordinal());
            }else{
                if(Separator.separatorList.contains(ch)){
                    print(String.valueOf(ch),Package.types[2].ordinal());
                    quotes++;
                    if(ch == '"' && quotes%2 != 0){
                        ch = program[++i];
                        while (ch != '"'){
                            str += ch;
                            ch = program[++i];
                        }
                        print(str,Package.types[1].ordinal());
                        --i;
                    }
                }
            }
            str = new String();
        }
    }

    private void print(String str,int type){
        System.out.println("("+str+","+type+")");
    }
}
