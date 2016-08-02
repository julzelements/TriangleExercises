package com.company;

public class Main {

    public static void main(String[] args) {
        Plotter plotter = new Plotter();
        UserInput input = new UserInput();
        String userInput = input.getUserInput(
                "Would you like to: \n" +
                "print an astrix?           type: 'a' \n" +
                "print a horizontal line?   type: 'h' \n" +
                "print a vertical line?     type: 'v'  \n" +
                "print a triangle?          type: 't'");

        String userInputCharacter;
        switch (userInput.charAt(0)) {
            case 'a': plotter.drawAstrix();
                break;
            case 'h': plotter.drawHorizontalLine();
                break;
            case 'v': plotter.drawVerticalLine();
                break;
            case 't': plotter.drawTriangle();
                break;
            default: System.out.println("Invalid selection");
        }
    }
}
