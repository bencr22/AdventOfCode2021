package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2Part2 {

    public static void main(String[] args) throws IOException {

        int depth = 0;
        int pos = 0;
        int aim = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/day2/day2input"));
            String line;
            while((line = br.readLine()) != null){
                String[] split = line.split(" ");
                String direction = split[0];
                int amt = Integer.parseInt(split[1]);

                switch (direction) {
                    case "forward" -> {
                        depth += aim * amt;
                        pos += amt;
                    }
                    case "up" -> aim -= amt;
                    case "down" -> aim += amt;
                }
                System.out.println(pos*depth);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
