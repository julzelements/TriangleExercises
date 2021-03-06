package com.company;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;


/**
 * Created by julz on 4/08/2016.
 */
public class PlotterTest {
    Plotter plotter = new Plotter();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void drawAstrix() throws Exception {
    plotter.createAstrix();
    }

    @Test
    public void drawHorizontalLine() throws Exception {
        String fiveStars =  plotter.createHorizontalLine(5);
        assertEquals("*****", fiveStars);

    }

    @Test
    public void drawVerticalLine() throws Exception {
        String fiveStars = plotter.createVerticalLine(5);
        String fiveStarsTest = "*\n" + "*\n" +"*\n" +"*\n" +"*\n";
        assertEquals(fiveStars, fiveStarsTest);

    }

    @Test
    public void drawTriangle() throws Exception {
        String fiveSidedTriangle = plotter.createRightTriangle(5);
        String fiveSidedTriangleTest = "*\n" + "**\n" + "***\n" + "****\n" + "*****";
        assertEquals(fiveSidedTriangleTest, fiveSidedTriangle);
    }

    @Test
    public void concatenate() throws Exception {
        String fiveStars = "*****";
        String fiveStarsTest = plotter.generateCharacters("*", 5);
        assertEquals(fiveStars, fiveStarsTest);

        String emptyString = "";
        String emptyStringTest = plotter.generateCharacters("*", 0);
        assertEquals(emptyString, emptyStringTest);
    }

    @Test
    public void drawIsoscelesTriangle() throws Exception {
        String fiveTallIsoscelesTriangle = plotter.createIsoscelesTriangle(5);
        String fiveTallIsoscelesTriangleTest = "    *    \n" + "   ***   \n" + "  *****  \n" + " ******* \n" + "*********";
        assertEquals(fiveTallIsoscelesTriangleTest,fiveTallIsoscelesTriangle);
    }

    @Test
    public void drawDiamond() throws Exception {
        String threeTallDiamond = plotter.createDiamond(3);
        String threeTallDiamondTest = "  *  \n" + " *** \n" + "*****\n" + " *** \n" + "  *  ";
        assertEquals(threeTallDiamond, threeTallDiamondTest);
    }

    @Test
    public void drawDiamondName() throws Exception {
        String threeTallDiamondName = plotter.createDiamondName(3, "Julian");
        String threeTallDiamondNameTest = "  *  \n" + " *** \n" + "Julian\n" + " *** \n" + "  *  ";
        assertEquals(threeTallDiamondName, threeTallDiamondNameTest);
    }

    @Test
    public void drawFizzBuzz() throws Exception {
        String fizzBuzz = plotter.fizzBuzz(15);
        String fizzBuzzTest = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        assertEquals(fizzBuzz, fizzBuzzTest);
    }

    @Test
    public void testPrimeFactors() throws Exception {
        ArrayList<Integer> thirtyPrime = new ArrayList<Integer>();
        thirtyPrime.add(2);
        thirtyPrime.add(3);
        thirtyPrime.add(5);
        assertEquals(plotter.generate(30),thirtyPrime);



    }
    @Test
    public void testPrimeFourteen() throws Exception {
        ArrayList<Integer> fourteenPrime = new ArrayList<Integer>();
        fourteenPrime.add(2);
        fourteenPrime.add(7);
        assertEquals(plotter.generate(14), fourteenPrime);
    }

    @Test
    public void testEightSixtyFour() throws Exception {
        ArrayList<Integer> eightSixtyFourPrime = new ArrayList<Integer>();
        eightSixtyFourPrime.add(2);
        eightSixtyFourPrime.add(3);
        assertEquals(plotter.generate(864), eightSixtyFourPrime);
    }
    @Test
    public void testArrayOfBoolean() throws Exception {
        plotter.generate(8);
        
    }
}