package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
        DrawLine drawLine = new DrawLine();
        UserInput input = new UserInput();
        String userInput = input.getUserInput(
                "Would you like to: \n" +
                "print an astrix?           type: 'a' \n" +
                "print a horizontal line?   type: 'h' \n" +
                "print a vertical line?     type: 'v'  \n" +
                "print a triangle?          type: 't'");

        String userInputCharacter;
        switch (userInput.charAt(0)) {
            case 'a': userInputCharacter = "*";
                break;
            case 'h': drawLine.drawHorizontalLine();
                break;
            case 'v': drawLine.drawVerticalLine();
                break;
            case 't': drawLine.drawTriangle();
                break;
            default: userInputCharacter = "Invalid selection";
        }
    }
}
