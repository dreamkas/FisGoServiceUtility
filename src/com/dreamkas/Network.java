/*
Класс работы с сетью

@author  Kashitsyn Denis
@version 1.0
@since   2017-08-23

 */

package com.dreamkas;

import java.io.*;
import java.net.URL;
import java.util.Iterator;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.*;

public class Network {
    private final int DOWNLOAD_BUFFER_LEN = 1024;

    public int getUpdate(String url) {
        try {
            //скачка json апдейта
            URL jsonLink           = new URL(url);
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(
                            jsonLink.openStream()));

            String line     = reader.readLine();
            if(line.compareTo("{}") == 0){
                return 1;
            }

            JSONObject json = new JSONObject(line);

            JSONArray msg = (JSONArray) json.get("updates");
            String md5         = null;
            String artifactUrl = null;
            for(int n = 0; n < msg.length(); n++) {
                JSONObject updates = msg.getJSONObject(n);
                md5                = (String)updates.get("md5");
                artifactUrl        = (String)updates.get("url");
            }

            //скачка самого артефакта обновления
            URL artifactUrlObj      = new URL(artifactUrl);
            BufferedInputStream bis = new BufferedInputStream(artifactUrlObj.openStream());
            FileOutputStream    fis = new FileOutputStream("fisGoUpdate.tar");
            byte[] buffer           = new byte[DOWNLOAD_BUFFER_LEN];
            int count               = 0;
            while((count = bis.read(buffer,0,DOWNLOAD_BUFFER_LEN)) != -1) {
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();

            //запись md5 суммы в файл cs
            FileWriter csfw     = new FileWriter("cs", false);
            String     finalMd5 = md5 + "\n";
            csfw.write(finalMd5);
            csfw.flush();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            ex.printStackTrace();
            return -1;
        }
        return 0;
    }
}
