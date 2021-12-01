import java.io.File;  
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 

public class AOC01 {

    // part 1: Find if the next number is increasing or decreasing
    static void part1(ArrayList<Integer> list) {
        Integer increaseCounter = 0;

        for (int i =1; i <list.size(); i++) {
            if (list.get(i) > list.get(i-1)) {
                increaseCounter ++;
            }
        }

        System.out.println(increaseCounter);
    }

    // part 2: for a window of 3 numbers, find the sum and check if it's increasing
    static void part2(ArrayList<Integer> list) {
        Integer increaseCounter = 0;
        Integer window1 = list.get(0) + list.get(1) + list.get(3);

        for (int i = 1; i < list.size() -3; i++) {
                Integer window2 = list.get(i) + list.get(i+1) + list.get(i+2);

                if (window1 < window2) {
                    increaseCounter ++;
                }
                
                // swap windows for next iteration
                window1 = window2;
        }

        System.out.println(increaseCounter);
    }


    public static void main(String[] args) throws FileNotFoundException {

        // scanner object to read data
        Scanner input_reader = new Scanner(new File("data\\input_day1_part1.txt"));

        // empty array list
        ArrayList<Integer> list = new ArrayList();

        // fill list with data 
        while (input_reader.hasNextInt()) {
            list.add(input_reader.nextInt());
        }

        part1(list);
        part2(list);

    }         
    
}