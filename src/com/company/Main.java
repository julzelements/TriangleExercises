package com.company;

public class Main {

    public static void main(String[] args) {
        Plotter plotter = new Plotter();
        UserInput input = new UserInput();
        String userInput = input.getString(
                "Would you like to: \n" +
                "print an astrix?                       type: 'a'\n" +
                "print a horizontal line?               type: 'h'\n" +
                "print a vertical line?                 type: 'v'\n" +
                "print a right angle triangle?          type: 'r'\n" +
                "print an isosceles triangle?           type: 'i'\n" +
                "print a diamond?                       type: 'd'\n" +
                "print a diamond with your name?        type: 'n'\n" +
                "Do the FizzBuzz?                       type: 'b'\n" +
                "Print some Prime Factors?              type: 'p'");

        String result = "";

        if (userInput.equals("a")) {
            //We need no further user input
            System.out.println(plotter.createAstrix());

        } else {
            //We need a number from the user to size the output
            Integer n = input.getInteger();

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
                case 'd':
                    result = plotter.createDiamond(n);
                    break;
                case 'n':
                    //We need the user's name
                    String userName = input.getUserName();
                    result = plotter.createDiamondName(n, userName);
                    break;
                case 'b':
                    result = plotter.createDiamond(n);
                    break;
                case 'p':
                    result = plotter.createDiamond(n);
                    break;

                default:
                    System.out.println("Invalid selection");
            }
            System.out.println(result);
        }
    }


}
