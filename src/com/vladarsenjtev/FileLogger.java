package com.vladarsenjtev;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileLogger {

    private final File logger = new File("logger.txt");

    public void addLog(String conf) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logger, true))) {
            writer.append(conf);
            writer.newLine();
        }
    }

    public File getLogger() {
        return logger;
    }
}