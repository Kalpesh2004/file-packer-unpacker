package com.packerunpacker.service;

import java.io.*;
import com.packerunpacker.util.FileUtil;

public class PackerService {

    private static final String OUTPUT_DIR = "output";
    private static final String PACKED_FILE = OUTPUT_DIR + "/packed.txt";

    public void pack(String directoryPath) {

        try {
            // Ensure output directory exists
            File outDir = new File(OUTPUT_DIR);
            if (!outDir.exists()) {
                outDir.mkdir();
            }

            // 🔥 CLEAR OLD PACKED FILE
            new FileWriter(PACKED_FILE, false).close();

            File folder = new File(directoryPath);
            File[] files = folder.listFiles();

            if (files == null || files.length == 0) {
                System.out.println("No files found to pack");
                return;
            }

            for (File file : files) {
                if (file.isFile()) {

                    FileUtil.writeBuffered("FILE_NAME:" + file.getName(), PACKED_FILE);

                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;

                    while ((line = br.readLine()) != null) {
                        FileUtil.writeBuffered(line, PACKED_FILE);
                    }

                    FileUtil.writeBuffered("END_OF_FILE", PACKED_FILE);
                    br.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
