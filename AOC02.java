import java.io.File;  
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AOC02{

    static void part1(ArrayList<String> list){

        Integer xCounter = 0;
        Integer yCounter = 0;

        for (int i=0; i<list.size(); i++) {

            String[] split = list.get(i).split("\\s+");
            String direction = split[0];
            Integer amount = Integer.valueOf(split[1]);

            switch (direction) {
                case("forward"):
                xCounter += amount;
                break;

                case("up"):
                yCounter += amount;
                break;

                case("down"):
                yCounter -= amount;
                break;
            }

        }

        System.out.println(xCounter * yCounter);

    }

    static void part2(ArrayList<String> list){

        Integer xCounter = 0;
        Integer depth = 0;
        Integer aim = 0;

        for (int i=0; i<list.size(); i++) {

            String[] split = list.get(i).split("\\s+");
            String direction = split[0];
            Integer amount = Integer.valueOf(split[1]);
            
            switch (direction) {
                case("forward"):
                xCounter += amount;
                depth += amount * aim;
                break;

                case("up"):
                aim -= amount;
                break;

                case("down"):
                aim += amount;
                break;
            }
        }

        System.out.println(xCounter * depth);

    }
    
    public static void main(String[] args) throws FileNotFoundException {


        // scanner object to read data
        //Scanner input_reader = new Scanner(new File("data\\input_day2_part1.txt"));
        Scanner input_reader = new Scanner(new File("data\\input_day2_part2.txt"));

        // empty array list
        ArrayList<String> list = new ArrayList();

        // fill list with data 
        while (input_reader.hasNextLine()) {
            list.add(input_reader.nextLine());
        }


        part1(list);
        part2(list);

    }         

}
    

