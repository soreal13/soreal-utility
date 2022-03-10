package com.sorealutility.service;


import com.sorealutility.model.MyDicV1;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

@Service
public class CustomizeService {


    public static void saveAsTxt(MyDicV1 myDicV1) {

        String filename = "C:\\Users\\sodyn\\Desktop\\otome-script\\"
                + myDicV1.getPath()
                + "\\dic\\"
//                + "d_"
                + myDicV1.getFilename();
//                + ".txt";

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
