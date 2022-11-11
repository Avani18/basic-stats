import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;

import gui.BasicStats;
import gui.BasicStatsGUI;
import model.BasicStatsModel;

public class BasicStatsTest {
    private static double EPS = 1e-9;

    @Test
    public void testCentralTendency() {
        double[] numbers = {2, 2, 3, 3, 3, 4, 4};
        double mean   = BasicStats.mean(numbers);
        assertEquals (3, mean, EPS);
        double median = BasicStats.median(numbers);
        assertEquals (3, median, EPS);
        double mode   = BasicStats.mode(numbers);
        assertEquals (3, mode, EPS);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMedian() {
      //Median should be 8.0 since size is even
      /* double[] numbers = {1, 4, 7, 9, 11, 21}; */
      double[] numbers = {9, 11, 1, 4, 7, 21};

      double median = BasicStats.median(numbers);
      assertEquals(8.0, median, EPS);

      //Median should be 7 since size is odd
      double[] numbers2 = {9, 1, 4, 7, 21};
      median = BasicStats.median(numbers2);
      assertEquals(7, median, EPS);

      //Median should be 3 since size is 1
      double[] numbers3 = {3};
      median = BasicStats.median(numbers3);
      assertEquals(3, median, EPS);

      // Median fails input validation and throws exception
      double[] numbers4 = {};
      median = BasicStats.median(numbers4);

      // Median fails input validation and throws exception
      double[] numbers5 = null;
      median = BasicStats.median(numbers5);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMode() {
      //Mode should be 1 since we are taking the first mode
      double[] numbers = {1, 4, 7, 9, 11, 21};
      double mode   = BasicStats.mode(numbers);
      assertEquals (1, mode, EPS);

      //Mode should be 4
      double[] numbers2 = {1, 4, 4, 7, 9, 11, 21};
      mode   = BasicStats.mode(numbers2);
      assertEquals (4, mode, EPS);

      //Mode should be 7
      double[] numbers3 = {4, 4, 7, 7, 7, 11, 11};
      mode   = BasicStats.mode(numbers3);
      assertEquals (7, mode, EPS);

      //Mode should be 7
      double[] numbers4 = {7};
      mode   = BasicStats.mode(numbers4);
      assertEquals (7, mode, EPS);

      // Mode fails input validation and throws exception
      double[] numbers5 = {};
      mode = BasicStats.mode(numbers5);

      // Mode fails input validation and throws exception
      double[] numbers6 = null;
      mode = BasicStats.mode(numbers6);
    }

    // Model test case
    // Test for when a number is added to the model
    @Test(expected=IllegalArgumentException.class)
    public void testAddNum() {
        BasicStatsModel model = new BasicStatsModel();

        // Add number successful
        model.addNumber(5.0);
        assertEquals(1, model.getArrayDouble().length);

        // Add negative number successful
        model.addNumber(-5.0);
        assertEquals(2, model.getArrayDouble().length);

        // Add number fails
        model.addNumber(null);
    }

    // Test for various cases to compute max number
    @Test(expected=IllegalArgumentException.class)
    public void testMax() {
        double max;

        // Max passes input validation and produces expected result
        double[] numbers1 = {1, 3, 5, 43, 12, 87, 90};
        max = BasicStats.max(numbers1);
        assertEquals(90.0, max, EPS);

        // Max passes input validation and produces expected result
        double[] numbers2 = {1, -3, 5, -43, 12, 87, -90};
        max = BasicStats.max(numbers2);
        assertEquals(87.0, max, EPS);

        // Max passes input validation and produces expected result
        double[] numbers3 = {-10};
        max = BasicStats.max(numbers3);
        assertEquals(-10.0, max, EPS);

        // Max passes input validation and produces expected result
        double[] numbers4 = {-43, -12, -87, -90};
        max = BasicStats.max(numbers4);
        assertEquals(-12.0, max, EPS);

        // Max fails input validation and throws exception
        double[] numbers5 = {};
        max = BasicStats.max(numbers5);

        // Max fails input validation and throws exception
        double[] numbers6 = null;
        max = BasicStats.max(numbers6);
    }

    // View test case
    // Tests if initial configuration is displayed fine
    @Test
    public void testInitialView() {
        BasicStatsGUI bsg = new BasicStatsGUI();

        // Test all fields in initial configuration
        assertEquals("", bsg.getCountView().getText());
        assertEquals("", bsg.getMaxView().getText());
        assertEquals("", bsg.getMeanView().getText());
        assertEquals("", bsg.getMedianView().getText());
        assertEquals("", bsg.getNumbersView().getText());
        assertEquals("", bsg.getNumberField().getText());
    }

    // Controller test case
    // Tests the functionality of Reset button and Reset configuration
    @Test
    public void testResetController() {
        BasicStatsGUI bsg = new BasicStatsGUI();
        BasicStatsModel model = bsg.getModel();

        model.addNumber(10.0);
        model.addNumber(20.0);

        // Verify add number method
        assertEquals(2, model.getArrayDouble().length);

        JButton resetButton = bsg.getResetButton();
        // Click reset button
        resetButton.doClick();

        // Test all fields in reset configuration
        assertEquals("", bsg.getCountView().getText());
        assertEquals("", bsg.getMaxView().getText());
        assertEquals("", bsg.getMeanView().getText());
        assertEquals("", bsg.getMedianView().getText());
        assertEquals("", bsg.getNumbersView().getText());

        // Bug fix test
        assertEquals("", bsg.getNumberField().getText());

        // Verify model array length
        assertEquals(0, model.getArrayDouble().length);
    }
}
