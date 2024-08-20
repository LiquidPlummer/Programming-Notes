package com.liquidplummer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Integer> integerList = new ArrayList<>();
        Integer integer = 5;
        Iterator<Integer> iter = integerList.iterator();
        while(iter.hasNext()) {
            Integer i = iter.next();
        }

        for(Integer tempInteger : integerList) {

        }
    }
}
