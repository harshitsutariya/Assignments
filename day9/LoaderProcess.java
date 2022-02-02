package com.uks.LENOVO.core.day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LoaderProcess
{
    static String filePath,fileName;
    static Map<Integer, EmployeeDetail> map = new HashMap<>();
    static String[] data;

    public LoaderProcess(String fileName)
    {
        this.fileName = fileName;
    }

    static synchronized String[] readfile() throws IOException {

        Properties properties = new Properties();

        properties.load(new FileReader("D:\\UKSSkillup\\src\\com\\uks\\LENOVO\\core\\day9\\UserInfo.properties"));

        String filepathUserLoginInfo = properties.getProperty("user-login.filepath");
        String filepathUserInfo = properties.getProperty("userinfo.filepath");

        if (fileName.equals("userLoginInfo")) {
            filePath = filepathUserLoginInfo;
        }
        if (fileName.equals("userInfo")) {
            filePath = filepathUserInfo;
        }

        String[] arr=new String[2];
        arr[0]=filepathUserLoginInfo;
        arr[1]=filepathUserInfo;
        return arr;
    }

    static synchronized Map<Integer, EmployeeDetail> loadUserLoginInfo() throws IOException, InterruptedException {

        String[] arr = readfile();

        String line = "";
        String splitBy = ",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(arr[0]));

        int i = 1;
        while ((line = bufferedReader.readLine()) != null) {
            data = line.split(splitBy);

                EmployeeDetail employee = new EmployeeDetail(data[0], data[3]);

                if (map.containsKey(i)) {
                    employee = map.get(i);
                }
                employee.userid = data[0];
                employee.username = data[1];
                employee.password = data[2];
                employee.userrole = data[3];
                map.put(i, employee);

            i++;
        }
        return map;
    }

    static synchronized Map<Integer, EmployeeDetail> loadUserInfo() throws IOException, InterruptedException {

        String[] arr = readfile();

        String line = "";
        String splitBy = ",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(arr[1]));

        int i = 1;
        while ((line = bufferedReader.readLine()) != null) {
            data = line.split(splitBy);

                EmployeeDetail employee = new EmployeeDetail(data[1], data[2], data[3], data[4], data[5]);

                if (map.containsKey(i))
                {
                    employee = map.get(i);
                }
                employee.username=data[1];
                employee.address = data[2];
                employee.city = data[3];
                employee.basicsal = data[4];
                employee.telnumber = data[5];
                map.put(i, employee);

            i++;
        }
        return map;
    }

    static Map<Integer,EmployeeDetail> map1=new HashMap<>();
    static synchronized void mergeInfoAsObject() throws IOException, InterruptedException {

        map1 =map;
        FinderProcess.authenticate();
    }

}
