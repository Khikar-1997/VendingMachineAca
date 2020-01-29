package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Comand comand = Converter.convertInputComand(text);
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine.getProduct(comand));
    }
}
