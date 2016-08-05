package com.company;

/**
 * Created by julz on 2/08/2016.
 */
public class Plotter {

    public String createAstrix(){
        return "*";
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
        String triangle = "";

        for(int i = 0; i < n; i++){
                int spaces = (n - (i + 1));
                int astrixs = i;
            String newRow = getRowWithNewline((i != 0), spaces, astrixs);
            triangle = triangle + newRow;
            }
        return triangle;
    }

    public String createDiamond(int n) {
        String result = "  *  \n" + " *** \n" + "*****\n" + " *** \n" + "  *  ";
        return result;
    }



    public String getIsoscelesTriangleRow(int spaces, int astrixs) {
        String s = concatenate(" ", spaces);
        String a = concatenate("*", astrixs);
        String newRow = s + a + "*" + a + s;
        return newRow;
    }

    public String getRowWithNewline(Boolean rowWithNewLine, int spaces, int astrixs) {
        if (rowWithNewLine) {
            return "\n" + getIsoscelesTriangleRow(spaces, astrixs);
        } else {
            return getIsoscelesTriangleRow(spaces, astrixs);
        }

    }

    public String concatenate(String argument, int n){
        String result = new String();
        for(int i = 0; i < n; i++){
            result = result + argument;
        }
        return result;
    }

}
