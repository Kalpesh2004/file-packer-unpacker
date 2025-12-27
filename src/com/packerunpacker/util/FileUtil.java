package com.packerunpacker.util;

import java.io.*;

public class FileUtil {
    public static void writeBuffered(String data, String filePath)throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
        bw.write(data);
        bw.newLine();
        bw.close();
    }

    public static String readBuffered(String filePath)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        String line;

        while((line = br.readLine())!= null){
            sb.append(line).append("\n");
        }
        br.close();
        return sb.toString();
    }
}
