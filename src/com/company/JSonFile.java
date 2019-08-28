package com.company;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class JSonFile {

    public static void jsonFileWriter(String fileName ,  JSONObject TempObj) throws JSONException {
        try {
            FileWriter file = new FileWriter(fileName + ".JSON" , true);
            file.write(TempObj.toString());
            String newline = System.getProperty("line.separator");
            file.append(newline) ;
            file.flush();
            file.close();
           // System.out.println("JSon file created with the name of " + fileName );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public JSONObject convertStringBuilderToJsonObj(StringBuilder result) throws JSONException {
        String jsonString = result.toString() ;
        JSONObject jsonObj = new JSONObject(jsonString.toString());
        return jsonObj ;
        // Printing out the output for Testing.
        /*
        System.out.println("JSONString = " + jsonString);
        System.out.println("---------------------------");
        System.out.println("JSONObject = " + jsonObj);
         */
    }


}

