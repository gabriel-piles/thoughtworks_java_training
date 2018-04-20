package com.company;

public class FizzBuzz {

    public static void fizz_buzz() {

        print_fizzbuzz_numbers(100);
    }

    private static void print_fizzbuzz_numbers(int number) {
        for (int i = 1; i < number; i++) {
            System.out.println(replace_number_if_needed(i));
        }
    }

    private static String replace_number_if_needed(int number_to_check){

        String valueToReturn = String.valueOf(number_to_check);

        if (number_to_check % 3 == 0){
            valueToReturn = "Fizz";

            if (number_to_check % 5 == 0){
                valueToReturn += "Buzz";
            }
        }
        else if(number_to_check % 5 == 0){
            valueToReturn = "Buzz";
        }

        return valueToReturn;
    }

}
