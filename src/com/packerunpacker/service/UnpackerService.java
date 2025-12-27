package com.packerunpacker.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UnpackerService {

    public void unpack(String packedFilePath){

        try{
            BufferedReader br = new BufferedReader(new FileReader(packedFilePath));
            String line;

            BufferedWriter bw = null;

            while((line = br.readLine())!= null){

                if(line.startsWith("FILE_NAME: ")){

                    String fileName = line.substring(10);
                    bw = new BufferedWriter(new FileWriter("output/"+fileName));
                }
                else if(line.equals("END_OF_FILE")){
                    if(bw != null){
                        bw.close();
                    }
                }
                else{
                    if( bw != null){
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
