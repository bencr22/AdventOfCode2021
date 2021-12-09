package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Day3Part1 {

    public static void main(String[] args){

        ArrayList<String[]> data = new ArrayList<>();
        int zeroCount = 0;
        int oneCount = 0;
        String gamma = "";
        String epsilon = "";


        try {
            BufferedReader br = new BufferedReader(new FileReader("src/day3/day3input"));
            String line;
            while ( (line = br.readLine()) != null){
                String[] temp = line.split("");
                data.add(temp);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        int elementLength = data.get(0).length;

        // loops through each index (columns)
        for (int index=0; index < elementLength; index++){
            // loops through each line
            for (String[] s : data){
                // gets the correct char
                if (s[index].equals("0") ){
                    zeroCount ++;
                } else{
                    oneCount ++;
                }
            }
            // finds which digit is MODE
            if (oneCount > zeroCount) {
                gamma += "1";
                epsilon += "0";
            } else {
                gamma += "0";
                epsilon += "1";
            }
            // resets the counters
            zeroCount = 0;
            oneCount = 0;
        }
        
        int denaryGamma  = Integer.parseInt(gamma, 2);
        int denaryEpsilon = Integer.parseInt(epsilon, 2);
        int fuel = denaryEpsilon * denaryGamma;
        System.out.println(fuel);
    }

}
