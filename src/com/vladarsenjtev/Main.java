package com.vladarsenjtev;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
        FileLogger fileLogger = new FileLogger();
        fileLogger.addLog("08/05/22 - Успех");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLogger.getLogger()))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
    }
}
