package com.teachmeskills.lesson_11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListDocuments {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner inputWay = new Scanner(System.in);
        String num = inputWay.nextLine();   //Way to File -> "C:\\Users\\admin\\Desktop\\Documents.txt";
        File file = new File(num);
        Scanner scaner = new Scanner(file);
        String sim = "";
        while (scaner.hasNextLine()) {
            sim = scaner.next();
            list.add(sim);
        }
        for (String list1 : list) {
            if (list1.length() == 15) {
                System.out.println("Valid numbers: " + list1);
                File file1 = new File("C:\\Users\\admin\\Desktop\\valid.txt");
                try {
                    FileWriter writer = new FileWriter(file1, true);
                    writer.write(list1 + "\n");
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
            if (list1.length() < 15) {
                System.out.println("No valid numbers: " + list1);
                File file2 = new File("C:\\Users\\admin\\Desktop\\noValid.txt");
                try {
                    FileWriter writerN = new FileWriter(file2, true);
                    writerN.write(list1 + "  " + "Numbers less then 15" + "\n");
                    writerN.flush();
                    writerN.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }
        System.out.println("Wrote files.");

    }
}
