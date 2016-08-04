package com.company;

/**
 * Created by julz on 2/08/2016.
 */
public class Plotter {

    public String drawAstrix(){
        System.out.println("*");
        return null;
    }

    public void drawHorizontalLine(){
        int lineLength = getIntegerFromUser();
        String line = createHorizontalLine(lineLength);
        System.out.println(line);
    }

    public void drawVerticalLine(){
        int lineLength = getIntegerFromUser();
        String line = createVerticalLine(lineLength);
        System.out.println(line);
    }

    public void drawTriangle(){
        int n = getIntegerFromUser();
        String line = createRightTriangle(n);
        System.out.println(line);
    }

    private int getIntegerFromUser() {
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

    public String createHorizontalLine(int lengthOfLine) {
        String line = new String();
        for(int i=1; i<=lengthOfLine; i++){
            line = line + "*";
        }
        return line;
    }

    private String createVerticalLine(int lengthOfLine) {
        String line = new String();
        for(int i=1; i<=lengthOfLine; i++){
            line = line + "*\n";
        }
        return line;
    }

    private String createRightTriangle(int n) {
        String triangle = new String();

        for(int i = 1; i<= n; i++) {
            String line = new String();
            for(int j = 1; j<=i; j++){
                line = line + "*";
            }
            triangle = triangle + "\n" + line;
        }
        return triangle;
    }
}
