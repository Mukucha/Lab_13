package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/data.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //printing the size of collections

        System.out.println("The Location size is : "+employees.size());

        //printing the content using :
        //  standard loop : for
        System.out.println("...");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        //  For Each loop :
        System.out.println("...");
        for (String employee:employees
        ) {
            System.out.println(employee);
        }
        // Iterator interface
        System.out.println(".... ");
        Iterator<String> itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}