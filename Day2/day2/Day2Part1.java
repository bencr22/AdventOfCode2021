package day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day2Part1 {

    public static void main(String[] args) throws IOException {

        int depth = 0;
        int pos = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/day2/day2input"));
            String line;
            while((line = br.readLine()) != null){
                String[] split = line.split(" ");
                String direction = split[0];
                int amt = Integer.parseInt(split[1]);

                switch (direction) {
                    case "forward" -> pos += amt;
                    case "up" -> depth -= amt;
                    case "down" -> depth += amt;
                }
            System.out.println(pos*depth);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}

