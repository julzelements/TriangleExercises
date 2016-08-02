package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
        UserInput input = new UserInput();
        String name = input.getUserInput("Would you like to print an astrix? y/n");

        String userChoice;
        switch (name.charAt(0)) {
            case 'y': userChoice = "*";
            break;
            case 'n': userChoice = "Maybe another time hey.";
                break;
            default: userChoice = "Invalid selection";
        }
        System.out.println(userChoice);
    }
}
