package com.uks.LENOVO.core.day8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmpInfoMerger implements Runnable {

    public  void writeToResource(String path,String mode,String repath) throws IOException {

        File file=new File(path);
        File resourceFile=new File(repath);

        Path input = file.toPath();
        Path output = resourceFile.toPath();

        List<String> lines = Files.readAllLines(input);

        for(String line: lines){
            Files.write(output,lines);
        }
    }

    @Override
    public void run() {

    }
}
