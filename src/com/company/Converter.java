package com.company;

public class Converter {

    public static Comand convertInputComand(String text){
        String[] textArray = text.split(":");
        String textPart1 = textArray[0];
        String textPart2 = textArray[1];
        Comand comand = new Comand();
        comand.setRow(textPart1);
        comand.setCollons(Integer.parseInt(textPart2));
        return comand;
    }

}
