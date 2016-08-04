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

        Integer n = getIntegerFromUser();
        String result = new String();

        switch (userInput.charAt(0)) {
            case 'a': result = plotter.createAstrix();
                break;
            case 'h': result = plotter.createHorizontalLine(n);
                break;
            case 'v': result = plotter.createVerticalLine(n);
                break;
            case 't': result = plotter.createRightTriangle(n);
                break;
            default: System.out.println("Invalid selection");
        }
        System.out.println(result);
    }

    private static int getIntegerFromUser() {
        UserInput userInput = new UserInput();
        int lengthInteger = 0;
        String lengthString = userInput.getUserInput("How long a line should I draw? \n" +
                "Input nonzero integer:");

        try {
            lengthInteger =  Integer.parseInt(lengthString);
        } catch (NumberFormatException ex)  {
            System.out.println("Not a valid integer");
        }

        return lengthInteger;
    }
}
