package com.company;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



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
        String fiveStarsTest = plotter.concatenate("*", 5);
        assertEquals(fiveStars, fiveStarsTest);

        String emptyString = "";
        String emptyStringTest = plotter.concatenate("*", 0);
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
    public void invertLines() throws Exception {
        String result = plotter.invertStringsWithSeparator("    *    \n" + "   ***   \n" + "  *****  \n" + " ******* \n" + "*********", "\n");
        System.out.println(result);
    }

}