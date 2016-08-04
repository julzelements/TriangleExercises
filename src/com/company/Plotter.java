package com.company;

/**
 * Created by julz on 2/08/2016.
 */
public class Plotter {

    public String createAstrix(){
        return "*";
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

    public String createVerticalLine(int lengthOfLine) {
        String line = new String();
        for(int i=1; i<=lengthOfLine; i++){
            line = line + "*\n";
        }
        return line;
    }

    public String createRightTriangle(int n) {
        String triangle = "*";

        for(int i = 1; i< n; i++) {
            String line = "*";
            for(int j = 1; j<=i; j++){
                line = line + "*";
            }
            triangle = triangle + "\n" + line;
        }
        return triangle;
    }

    public String createIsoscelesTriangle(int n) {
        //First Row is done manually
        String triangle = (n - 1) + "*" + (n - 1);
        for(int i = 1; i < n; i++){
                int spaces = (n - (i + 1));
                int astrixs = i;
            String s = concatenate(" ", spaces);
            String a = concatenate("*", astrixs);
            triangle = triangle + "\n" + s + a + "*" + a + s;

            System.out.println("i:" + i + ", s:" + spaces + ", a:" + astrixs);


            }
        return triangle;
    }

    public String concatenate(String argument, int n){
        String result = new String();
        for(int i = 1; i < n; i++){
            result = result + argument;
        }
        return result;
    }

}
