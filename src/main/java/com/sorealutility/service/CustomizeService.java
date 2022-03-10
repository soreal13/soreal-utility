package com.sorealutility.service;

import com.sorealutility.model.MyDicV1;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;
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

    public static void encodeFile() {

        String[] args = {"C:\\Users\\rladu\\OneDrive\\Desktop\\op01_0.ks"};

        if (args.length == 0) {                   // args.length 는 옵션 개수
            System.err.println("Input Filename...");
            System.exit(1);                         // 읽을 파일명을 주지 않았을 때는 종료
        }

        String outFilename = args[0] + ".txt";    // 출력 파일명 만들기, uni 라는 확장자를 붙여서


        try {
            ////////////////////////////////////////////////////////////////
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(args[0]),
                            "SHIFT-JIS"
                    )
            );

            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outFilename),
                            "utf-8"
                    )
            );

            String s;

            while ((s = in.readLine()) != null) {
                out.write(s); out.newLine();
            }

            in.close(); out.close();
            ////////////////////////////////////////////////////////////////
        } catch (IOException e) {
            System.err.println(e); // 에러가 있다면 메시지 출력
            System.exit(1);
        }

    }


}
