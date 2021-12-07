package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1Part1 {

    public static void main(String[] args){

        int count = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();

        try {
            File file = new File("src/day1/day1input");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                Integer data = sc.nextInt();
                values.add(data);
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

        for (int i=0; i < values.size()-1; i++){
            if (values.get(i) < values.get(i+1)){
                count ++;
            }
        }

        System.out.println(count);
    }

}
