package com.sorealutility.service;


import com.sorealutility.model.ConvertV1;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;

@Service
public class ConvertService {


    public static void saveTxtFile(ConvertV1 convertV1) {

        String filename = "C:\\Users\\sodyn\\Desktop\\touched\\"
                + convertV1.getPath()
                + "\\jp\\"
                + convertV1.getFilename()
                + ".txt";

        try {
            File file = new File(filename);

            file.createNewFile();

            FileWriter fw = new FileWriter(file, true);

            fw.write(convertV1.getScript());
            fw.flush();
            fw.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
