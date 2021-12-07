package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1Part2 {

    public static void main(String[]args){

        int count = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        try {
            File file = new File("src/day1/day1input");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                Integer data = sc.nextInt();
                nums.add(data);
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

        for(int x=0; x < nums.size() -3; x++){
            int lower = nums.get(x) + nums.get(x+1) + nums.get(x+2);
            int upper = nums.get(x+1) + nums.get(x+2) + nums.get(x+3);

            if(lower < upper){
                count ++;
            }

        }System.out.println(count);
    }

}
