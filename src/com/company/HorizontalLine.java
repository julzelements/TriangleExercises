package com.company;

/**
 * Created by julz on 2/08/2016.
 */
public class HorizontalLine {
    public void drawLine(){

    }

    public int getIntegerFromUser() {
        UserInput userInput = new UserInput();
        int lengthInteger = 0;
        String lengthString = userInput.getUserInput("How long a line should I draw? Input nonzero integer:");

        try {
            lengthInteger =  Integer.parseInt(lengthString);
        } catch (NumberFormatException ex)  {
            System.out.println("Not a valid integer");
        }

        return lengthInteger;
    }

    private void createHorizontalLine(int lengthOfLine) {
        String line = new String();
        for(int i=1; i<lengthOfLine; i++){
            line = line + "*";
        }
    }
}
