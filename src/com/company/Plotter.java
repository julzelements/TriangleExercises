package com.company;




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


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
        String bottom = createDiamondBottom(n);
        String top = createIsoscelesTriangle(n);
        return top + "\n" + bottom;

    }

    public String invertStringsWithSeparator(String string, String separator) {
        String[] array = string.split(separator);
        String[] invertedArray = reverseArray(array);
        return strJoin(invertedArray, "\n");
    }

    private String createDiamondBottom(int n) {
        String topTriangle = createIsoscelesTriangle(n);
        String[] parts = topTriangle.split("\n");

        List<String> triangleList = new LinkedList<String>();
        for (int i = (parts.length - 2); i >= 0; i--) {
            triangleList.add(parts[i]);
        }

        String[] triangleArray = triangleList.toArray(new String[triangleList.size()]);
        return strJoin(triangleArray, "\n");
    }

    public String createDiamondName(int n, String name) {
        String top = invertStringsWithSeparator(createDiamondBottom(n),"\n");
        String bottom = createDiamondBottom(n);
        return top + "\n" + name + "\n" + bottom;
    }



    public String getIsoscelesTriangleRow(int spaces, int astrixs) {
        String s = generateCharacters(" ", spaces);
        String a = generateCharacters("*", astrixs);
        return s + a + "*" + a + s;
    }

    public String getRowWithNewline(Boolean rowWithNewLine, int spaces, int astrixs) {
        if (rowWithNewLine) {
            return "\n" + getIsoscelesTriangleRow(spaces, astrixs);
        } else {
            return getIsoscelesTriangleRow(spaces, astrixs);
        }

    }

    public String generateCharacters(String argument, int n){
        String result = new String();
        for(int i = 0; i < n; i++){
            result = result + argument;
        }
        return result;
    }

    private static String strJoin(String[] aArr, String sSep) {
        //Got this method from Stack overflow
        //http://stackoverflow.com/questions/1978933/a-quick-and-easy-way-to-join-array-elements-with-a-separator-the-opposite-of-sp
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.length; i < il; i++) {
            if (i > 0)
                sbStr.append(sSep);
            sbStr.append(aArr[i]);
        }
        return sbStr.toString();
    }

    public String[] reverseArray(String[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
        return array;
    }

    public String fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            int fizzTest = i%3;
            int buzzTest = i%5;
            int fizzBuzzTest = fizzTest + buzzTest;

            if (fizzBuzzTest == 0) {
                result.add("FizzBuzz");
            } else if (fizzTest == 0) {
                result.add("Fizz");
            } else if (buzzTest == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }

        }
        return arrayListToString(result, "\n");
    }

    private String arrayListToString(ArrayList<String> list, String delimiter){
        String listString = "";
        for (String s : list)
        {
            listString += s + delimiter;
        }
        return listString;
    }

//    public ArrayList<Integer> getPrimes(int n){
//
//    }

    public ArrayList<Integer> generate(int n) {

        ArrayList<Integer> primesList = new ArrayList<Integer>();
        Double divisor = 2.0;
        Double result = (double)n;

        while (divisor < n) {
            Double newResult = result / divisor;
            Double remainder = newResult%1.0;

            if (remainder == 0) {
                primesList.add(divisor.intValue());
                result = newResult;
                divisor = 2.0;
            } else {
                divisor = divisor + 1;
            }
        }
        return primesList;
    }

}
