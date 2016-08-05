package com.company;

import java.io.*;
/**
 * Created by julz on 2/08/2016.
 */
public class UserInput {


    public String getString(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 ) return null;
        } catch(IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public int getInteger() {
        
        int lengthInteger = 0;
        String lengthString = getString("Please input nonzero integer:");

        try {
            lengthInteger =  Integer.parseInt(lengthString);
        } catch (NumberFormatException ex)  {
            System.out.println("Not a valid integer");
        }

        return lengthInteger;
    }
}

