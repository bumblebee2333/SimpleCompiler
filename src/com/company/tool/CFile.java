package com.company.tool;

import java.io.*;

public class CFile {
    public static String readProgram() throws IOException {
        String s = null;
        StringBuilder sb = new StringBuilder();
        File file = new File("c_program.txt");
        if(!file.exists()){
            System.out.println("文件不存在！！！");
        }else {
            InputStreamReader input = new InputStreamReader(new FileInputStream("c_program.txt"));
            BufferedReader br = new BufferedReader(input);
            while ((s = br.readLine())!= null){
                sb.append(s);
            }
            input.close();
            br.close();
        }
        return sb.toString();
    }
}
