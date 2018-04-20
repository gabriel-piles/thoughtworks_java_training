package com.company;

public class Main {

    public static void main(String[] args) {
//        print_asterisk();
//        print_n_asterisk(3);
//        print_n_asterisk_in_column(7);
//        print_triangle(3);
//        print_centered_triangle(5);
//        print_diamond(3);
//        print_diamond_name("Gabo", 3);

//        FizzBuzz.fizz_buzz();
        PrimeFactors.print_prime_factors(-11);

    }

    public static void print_asterisk(){
        System.out.print("*");
    }

    public static void print_n_asterisk(int number){

        for (int i = 0; i < number; i++) {
            print_asterisk();
        }
    }

    public static void print_n_spaces(int number){

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void print_n_asterisk_in_column(int column_number){

        for (int i = 0; i < column_number; i++) {
            print_asterisk();
            System.out.print("\n");
        }
    }

    public static void print_triangle(int heigh){

        int number_asterisk = 1;

        for (int i = 0; i < heigh; i++) {

            print_n_asterisk(number_asterisk);
            System.out.print("\n");
            number_asterisk += 1;
        }
    }

    public static void print_top_centered_triangle(int heigh){

        int number_spaces_begining_row = heigh - 1;
        int number_asterisk = 1;

        for (int i = 0; i < heigh-1; i++) {

            print_n_spaces(number_spaces_begining_row);
            print_n_asterisk(number_asterisk);
            System.out.print("\n");
            number_asterisk += 2;
            number_spaces_begining_row -= 1;
        }
    }

    public static void print_centered_triangle(int heigh){

        print_top_centered_triangle(heigh);
        print_n_asterisk(heigh * 2 -1);
        System.out.print("\n");
    }

    public static void print_inverted_triangle(int heigh){

        int number_spaces_begining_row = 1;
        int number_asterisk = heigh * 2 -1;

        for (int i = 0; i < heigh; i++) {

            print_n_spaces(number_spaces_begining_row);
            print_n_asterisk(number_asterisk);
            System.out.print("\n");
            number_asterisk -= 2;
            number_spaces_begining_row += 1;
        }
    }

    public static void print_diamond(int heigh){

        print_centered_triangle(heigh);
        print_inverted_triangle(heigh-1);

    }

    public static void print_diamond_name(String name, int heigh){

        print_top_centered_triangle(heigh);
        System.out.println(name);
        print_inverted_triangle(heigh-1);

    }
}
