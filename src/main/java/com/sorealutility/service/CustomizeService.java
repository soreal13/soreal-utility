package com.sorealutility.service;

import com.sorealutility.model.MyDicV1;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

@Slf4j
@Service
public class CustomizeService {

    @Value("${soreal.path.peterpen}")
    private static String peterpen;


    public static void saveAsTxt(MyDicV1 myDicV1) {

        String filename = peterpen
                + myDicV1.getPath()
                + "\\dic\\"
                + myDicV1.getFilename()
                + ".txt";

        try {
            File file = new File(filename);

            file.createNewFile();

            FileWriter fw = new FileWriter(file, true);

            fw.write(myDicV1.getScript());
            fw.flush();
            fw.close();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void moveFile(ArrayList<ArrayList<String>> address) {

        System.out.println("in");


        for(ArrayList<String> ad : address) {

            File oldfile = new File(ad.get(0));
            File newfile = new File(ad.get(0).replace("Arabianslost", "Aracheck"));

            try{
                oldfile.renameTo(newfile);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
