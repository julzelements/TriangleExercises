package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
        UserInput input = new UserInput();
        String name = input.getUserInput(
                "Would you like to: \n" +
                "print an astrix?           type: 'a' \n" +
                "print a horizontal line?   type: 'h' \n" +
                "print a vertical line?     type: 'v'  ");

        String userChoice;
        switch (name.charAt(0)) {
            case 'a': userChoice = "*";
                break;
            case 'h': userChoice = "Horizontal";
                break;
            case 'v': userChoice = "vertical";
                break;
            default: userChoice = "Invalid selection";
        }
        System.out.println(userChoice);
    }
}
