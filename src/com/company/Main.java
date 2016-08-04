package com.company;

public class Main {

    public static void main(String[] args) {
        Plotter plotter = new Plotter();
        UserInput input = new UserInput();
        String userInput = input.getUserInput(
                "Would you like to: \n" +
                "print an astrix?                       type: 'a'\n" +
                "print a horizontal line?               type: 'h'\n" +
                "print a vertical line?                 type: 'v'\n" +
                "print a right angle triangle?          type: 'r'\n" +
                "print an isosceles triangle?           type: 'i'\n");

        String result = new String();

        if (userInput.equals("a")) {
            //We need no further user input
            System.out.println(plotter.createAstrix());

        } else {
            //We need a number from the user to size the output
            Integer n = getIntegerFromUser();

            switch (userInput.charAt(0)) {
                case 'h':
                    result = plotter.createHorizontalLine(n);
                    break;
                case 'v':
                    result = plotter.createVerticalLine(n);
                    break;
                case 'r':
                    result = plotter.createRightTriangle(n);
                    break;
                case 'i':
                    result = plotter.createIsoscelesTriangle(n);
                    break;
                default:
                    System.out.println("Invalid selection");
            }
            System.out.println(result);
        }
    }

    private static int getIntegerFromUser() {
        UserInput userInput = new UserInput();
        int lengthInteger = 0;
        String lengthString = userInput.getUserInput("Please input nonzero integer:");

        try {
            lengthInteger =  Integer.parseInt(lengthString);
        } catch (NumberFormatException ex)  {
            System.out.println("Not a valid integer");
        }

        return lengthInteger;
    }
}
