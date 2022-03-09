package com.sorealutility.service;

import com.sorealutility.model.ConvertV1;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;

@Slf4j
@Service
public class ConvertService {

    @Value("${soreal.path.common}")
    private static String commonPath;

    public static void saveTxtFile(ConvertV1 convertV1) {

        String filename =
                "C:\\Users\\rladu\\OneDrive\\Documents\\otome\\"
//                commonPath
                + convertV1.getPath()
                + "\\convert\\"
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
