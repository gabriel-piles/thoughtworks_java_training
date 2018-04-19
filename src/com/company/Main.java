package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        print_asterisk();
        print_n_asterisk(3);
        print_n_asterisk_in_column(7);
    }

    public static void print_asterisk(){
        System.out.println("*");
    }

    public static void print_n_asterisk(int asterisk_number){

        for (int i = 0; i < asterisk_number; i++) {
            System.out.print("*");
        }
    }

    public static void print_n_asterisk_in_column(int column_number){

        for (int i = 0; i < column_number; i++) {
            System.out.println("*");
        }
    }
}
