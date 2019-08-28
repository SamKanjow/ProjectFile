package com.company;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFormat {

    public void writeData(String fileName ,  String[] header , List<String[]> data){

        File file = new File(fileName + ".CSV");
        try {

            FileWriter outPutFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outPutFile);

            writer.writeNext(header);   // adding header to csv
            writer.writeAll(data);      // add data to csv
            writer.close();             // closing writer connection
            System.out.println("The CSV file created with the name of : " + fileName + "CSV.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

