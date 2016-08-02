package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
        UserInput input = new UserInput();
        String userInput = input.getUserInput(
                "Would you like to: \n" +
                "print an astrix?           type: 'a' \n" +
                "print a horizontal line?   type: 'h' \n" +
                "print a vertical line?     type: 'v'  ");

        String userInputCharacter;
        switch (userInput.charAt(0)) {
            case 'a': userInputCharacter = "*";
                break;
            case 'h': userInputCharacter = "Horizontal";
                HorizontalLine horizontalLine = new HorizontalLine();
                horizontalLine.getIntegerFromUser();
                break;
            case 'v': userInputCharacter = "vertical";
                break;
            default: userInputCharacter = "Invalid selection";
        }
        System.out.println(userInputCharacter);
    }
}
