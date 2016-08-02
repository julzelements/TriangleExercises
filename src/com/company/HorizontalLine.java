package com.company;

import javax.jws.soap.SOAPBinding;

/**
 * Created by julz on 2/08/2016.
 */
public class HorizontalLine {
    public int getNFromUser() {
        UserInput userInput = new UserInput();
        String line = userInput.getUserInput("How long a line should I draw? Input whole number only:");

        return 0;
    }
}
