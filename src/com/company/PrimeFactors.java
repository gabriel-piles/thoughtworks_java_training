package com.company;

import java.util.ArrayList;

public class PrimeFactors {

    public static void print_prime_factors(int number) {

        ArrayList<Integer> factors = new ArrayList<>();

        if (number <= 1){
            factors.add(number);
            print_factors(factors);
            return;
        }


        int next_factor = get_smallest_factor(number);

        while (next_factor != 1)
        {
            factors.add(next_factor);
            number = number / next_factor;
            next_factor = get_smallest_factor(number);
        }

        print_factors(factors);
    }

    private static void print_factors(ArrayList<Integer> factors) {
        for (int each_factor:factors) {
            System.out.print(each_factor + " ");
        }
    }

    private static int get_smallest_factor(int number) {
        int smaller_factor = number;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0)
            {
                smaller_factor = i;
                break;
            }
        }

        return smaller_factor;

    }
}
