package com.morey.cccpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tecno on 09/02/16.
 */
public class TaskOne {
    public static void main(String[] args) {
        //System.out.println("Hello, World!"); //
        ArrayList<Integer> input = getData("s1/s1.1.in");
        System.out.println(getTotal(input));
    }

    public static ArrayList getData(String fileName){
        ArrayList<Integer> data = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner sFile = new Scanner(file);
            int numLines = sFile.nextInt();
            //System.out.println("Number of lines: " + numLines);
            while (sFile.hasNext()){
                int tmp = sFile.nextInt();
                //System.out.print ("Input: " + tmp);
                if (tmp != 0){
                    //System.out.println(" input add!");
                    data.add(tmp);
                }else{
                    if (!data.isEmpty()){
                        data.remove(data.size()-1);
                        //System.out.println(" Last input removed...");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static int getTotal(ArrayList<Integer> input){
        int total = 0;
        for (Integer i: input) {
            total += i;
        }
        return total;
    }
}
