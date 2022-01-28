package com.uks.LENOVO.core.day8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EmpInfoMerger extends Thread {

    String filePath, mode, sharedVar;
    static Map<Integer, NameAddress> map = new HashMap<>();

    public EmpInfoMerger(String filePath, String mode, String sharedVar)
    {
        this.filePath = filePath;
        this.mode = mode;
        this.sharedVar = sharedVar;
    }

    @Override
    public void run() {
        if (mode.equals("read")) {
            try {
                writeToResource();
            } catch (IOException |InterruptedException e) {
                e.printStackTrace();
            }
        }

        else if (mode.equals("write")) {
            try {
                writeToFile();
            } catch (IOException |InterruptedException e) {
                System.out.println("IO Exception........");
            }
        }
    }

    synchronized void writeToResource() throws IOException, InterruptedException {

        System.out.println("Write to Resource process Start ...");

        String line = " ";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        int i = 1;
        while ((line = br.readLine()) != null) {
            NameAddress nameAddress = new NameAddress();
            if (map.containsKey(i)) {
                nameAddress = map.get(i);
            }
            if (sharedVar.equals("name")) {
                nameAddress.name = line;
            }
            if (sharedVar.equals("address")) {
                nameAddress.address = line;
            }

            map.put(i, nameAddress);
            i++;

            sleep(1000);
            this.notifyAll();
        }
        System.out.println("File Read Success...\n");
        br.close();
    }

    synchronized void writeToFile() throws IOException, InterruptedException {

        sleep(2000);

        File file = new File(filePath);
        boolean checkFile = file.createNewFile();
        if (checkFile) {
            System.out.println("New File Created..." + file.getPath()+"\n");
        } else {
            System.out.println("File Already Exist..." + file.getPath()+"\n");
        }

        if(map.isEmpty()){
            System.out.println("Sorry, Resource does not contain any data");
        }
        else {
            FileWriter fileWriter = new FileWriter(file);
            for (int i = 1; i <= map.size(); i++) {
                fileWriter.write(i + ")" + map.get(i).name + "\n" + map.get(i).address + "\n");
                sleep(1000);
                notifyAll();
            }
            printMap(map);

            map.clear();

            sleep(2000);

            fileWriter.close();
            System.out.println("\nFile Write Success...");
        }
    }

    public void printMap(Map<Integer, NameAddress> employees) {

        for (Map.Entry<Integer, NameAddress> entry : employees.entrySet())

            System.out.println(entry.getKey() + ") " + entry.getValue().name +
                    " \n " + entry.getValue().address);
    }
}