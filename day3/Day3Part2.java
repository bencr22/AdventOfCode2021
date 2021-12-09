package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Day3Part2 {

    public static void main(String[] args) {

        String tempData = """
                00100
                11110
                10110
                10111
                10101
                01111
                00111
                11100
                10000
                11001
                00010
                01010
                """;

        try {
            ArrayList<String> data = new ArrayList<>();

            Collections.addAll(data, tempData.split("\n"));

            int index = 0;
            while (data.size() > 1) {
                int[] onesCount = {0, 0, 0, 0, 0};
                int[] zerosCount = {0, 0, 0, 0, 0};

                // TODO -> trailing zeros are being removed

                for (String line : data) {
                    String[] lineArray = line.split("",-1);

                    System.out.println( lineArray[0] + "," + lineArray[1] + "," +lineArray[2] + "," +lineArray[3] + "," +lineArray[4] );

                    String s = lineArray[index];
                    if (s.equals("1")) {
                        onesCount[index] = onesCount[index] + 1;
                    } else {
                        zerosCount[index] = (zerosCount[index]) + 1;
                    }
                }
                index ++;

                for (int counter=0; counter < onesCount.length -1; counter++){
                    if (onesCount[counter] >= zerosCount[counter]){
                        for (String element : data){
                            if ( element.substring(counter).equals("0")){
                                data.remove(element);
                            }
                        }
                    } else {
                        for (String element : data){
                            if ( element.substring(counter).equals("1")){
                                data.remove(element);
                            }
                        }
                    }
                }

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    } // psvm
} // class



