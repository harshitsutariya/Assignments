package com.uks.LENOVO.core.day5;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMethod {

        public static List<BaseEmployee1> firstName () throws IOException {
        Comparator<BaseEmployee1> com = new Comparator<BaseEmployee1>() {

            @Override
            public int compare(BaseEmployee1 o1, BaseEmployee1 o2) {

                if ( (o1.fName).charAt(0) > (o2.fName).charAt(0) )
                    return 1;
                else
                    return -1;
            }
        };
        List<BaseEmployee1> list = RowPrinter.readFile();
        Collections.sort(list, com);
        return list;
    }

        public static List<BaseEmployee1> lastName () throws IOException {
        Comparator<BaseEmployee1> com = new Comparator<BaseEmployee1>() {

            @Override
            public int compare(BaseEmployee1 o1, BaseEmployee1 o2) {

                if ( (o1.lName).charAt(0) > (o2.lName).charAt(0) )
                    return 1;
                else
                    return -1;
            }
        };
        List<BaseEmployee1> list = RowPrinter.readFile();
        Collections.sort(list, com);
        return list;
    }

        public static List<BaseEmployee1> empType () throws IOException {
        Comparator<BaseEmployee1> com = new Comparator<BaseEmployee1>() {

            @Override
            public int compare(BaseEmployee1 o1, BaseEmployee1 o2) {

                if ( (o1.empType).charAt(0) > (o2.empType).charAt(0) )
                    return 1;
                else
                    return -1;
            }
        };
        List<BaseEmployee1> list = RowPrinter.readFile();
        Collections.sort(list, com);
        return list;
    }

        public static List<BaseEmployee1> basicSal () throws IOException {
        Comparator<BaseEmployee1> com = new Comparator<BaseEmployee1>() {

            @Override
            public int compare(BaseEmployee1 o1, BaseEmployee1 o2) {

                if ( (o1.basicSal) > (o2.basicSal) )
                    return 1;
                else
                    return -1;
            }
        };
        List<BaseEmployee1> list = RowPrinter.readFile();
        Collections.sort(list, com);
        return list;
    }

    public static List<BaseEmployee1> empcode() throws IOException {

            List<BaseEmployee1> list=RowPrinter.readFile();
            Collections.sort(list);
        return list;
    }

}
