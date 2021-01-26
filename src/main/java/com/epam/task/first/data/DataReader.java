package com.epam.task.first.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    //private static final int BUFFER_SIZE = 2048;

    public List<String> readData(String filename) throws DataException {
        List<String> resultList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line!=null)
            {
                resultList.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        return resultList;
    }

}
