package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class WindowsSliding {
    private static final Logger log = LoggerFactory.getLogger(WindowsSliding.class);

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("E:\\ProblemSolving\\dumpFiles.txt"));
        HashMap<Integer, Integer> no_freq = new HashMap<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        int result_unique = 0;
//        int number_inputs = in.nextInt();
//        int window_size = in.nextInt();
        int number_inputs = 100;
        int window_size = 45;
        Deque<Integer> window = new ArrayDeque<>(window_size);

        try {
            while (in.hasNextInt())
            {
                numbers.add(in.nextInt());
            }
        }catch (Exception e)
        {
            log.error("e: ", e);
        }
//        for (int i = 0; i < number_inputs; i++) {
//            numbers.add(in.nextInt());
//
//        }
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(1);


        //initialize the window slide
        int index = 0;
        while ((!(window_size <= window.size())) && index < numbers.size()) {
            {
                window.offerLast(numbers.get(index));
                // Find the frequency
                no_freq.put(numbers.get(index), no_freq.getOrDefault(numbers.get(index), 0) + 1);
            }
            index = index + 1;
        }
        result_unique = Math.max(result_unique, no_freq.size());


        for (int i = index; i < numbers.size(); i++) {
            // remove the leftmost element
            int r= 0;
//            System.out.println("The number is about to remove  "+ numbers.get(index) +" has frequency  "+ no_freq.get(numbers.get(index)) );

            if(!window.isEmpty())
            {
                r= window.pollFirst();
               no_freq.put(r, no_freq.get(r) - 1);
            }

            // check if the #frequency become zero , remove the key itself
            if(no_freq.get(r)==0)
            {
                no_freq.remove(r);
            }

            //add the rightmost element in the window size
            window.offerLast(numbers.get(i));
            // Find the frequency
            no_freq.put(numbers.get(i), no_freq.getOrDefault(numbers.get(i), 0) + 1);
//            System.out.println("The number is "+ numbers.get(index) +" has frequency  "+ no_freq.get(numbers.get(i)) );

            result_unique = Math.max(result_unique, no_freq.size());
        }

        in.close();
        System.out.println(result_unique);

    }

}



