package com.uks.LENOVO.core.day5;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowReader{

        public static void main(String args[]) throws IOException {

            RowPrinter.readFile();
            RowPrinter.print();
        }

        public static void printRecord() throws IOException {
            RowPrinter.readFile();
            List<BaseEmployee1> list=RowPrinter.readFile();
            Map<Integer, String> map = new HashMap<>();
            for(BaseEmployee1 e:list){

                map.put(e.empCode," "+e.fName+" "+e.lName+
                        " "+e.empType+" "+e.basicSal);

            }
            System.out.println(map);

        }
}
