package loop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<Integer>();


        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Please enter a number: ");
            String addNumber = userInput.nextLine();
            int my_num = Integer.parseInt(addNumber);
            numberArray.add(my_num);
        }
        
        userInput.close();
        
        System.out.println(numberArray);


        int sum = 0;
        for (int i : numberArray)
            sum += i;
        System.out.println("sum: " + sum);

        
        int product = 1;
        for (int i = 0; i < numberArray.size(); i++) 
        {
            product = product * numberArray.get(i);
        }
        System.out.println("product: " + product);


        int max = numberArray.get(0);
        for (int i = 0; i < numberArray.size(); i++) 
        {
            if (numberArray.get(i) > max)
                max = numberArray.get(i);
        }
        System.out.println("max num: " + max);


        int min = numberArray.get(0);
        for (int i = 0; i < numberArray.size(); i++) 
        {
            if (numberArray.get(i) < min)
                min = numberArray.get(i);
        }
        System.out.println("min num: " + min);
        
        
    }

}         
   