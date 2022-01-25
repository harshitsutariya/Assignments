package com.uks.LENOVO.core.day5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class RowToFileConverter
{
    public static void main(String[] args) throws IOException
    {

        String inputPath = args[0];
        String outputPath = args[1];

        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);

        Path input = inputFile.toPath();
        Path output = outputFile.toPath();

        List<String> lines = Files.readAllLines(input);

        for(String line: lines){
            System.out.println(line);
            Files.write(output,lines);
        }
    }
}