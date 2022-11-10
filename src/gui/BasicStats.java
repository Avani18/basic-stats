package gui;

import java.util.*;

/**
 * A simple class to compute basic, descriptive statistics.
 */
public class BasicStats {

    public static void main(String ... args) {
        System.out.println("Let's do some basic statistics...");
    }

    /**
     * Compute the mean of an array of numbers.
     */
    public static double mean(double ... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Compute the median of an array of numbers.
     */
    public static double median(double ... numbers) {
      Arrays.sort(numbers);

      int size = numbers.length;
      double median = 0.0;

      if (size > 0) {
        if (size % 2 == 0) {
          median = (numbers[size >> 1] + numbers[(size >> 1) - 1])/2;
        }
        else {
          median = numbers[size >> 1];
        }
      }

      return median;
    }

    /**
     * Compute the mode of an array of numbers.
     */
    public static double mode(double ... numbers) {
      double mode = 0.0;
      int modeCount = 0;

      for (double num: numbers) {

        int count = 0;

        for (double otherNum: numbers) {
          if (num == otherNum) {
            count++;
          }
        }

        if (count > modeCount) {
          modeCount = count;
          mode = num;
        }

      }

      return mode;
    }

    public static double max(double ... numbers) {

        if (numbers == null)
        {
            throw new Exception("array is null");
        }
        if (numbers.length == 0)
        {
            throw new Exception("array is empty");
        }
        for(double num: numbers)
        {
            if (num == null)
            {
                throw new Exception("number is null");
            }
        }
        // try
        // {
        //     for (double num: numbers)
        //     {
        //         Double temp = Double.parseDouble(Double.toString(num));
        //     }
        // }
        // catch(NumberFormatException nfe)
        // {
        //     throw new NumberFormatException("Number is not valid!");
        // }
        // catch(NullPointerException npe)
        // {
        //     throw new NullPointerException("Number is not valid!");
        // }

        double maxNumber = Double.NEGATIVE_INFINITY;

        for (double num: numbers)
        {
            if (num > maxNumber)
            {
                maxNumber = num;
            }
        }

        return maxNumber;
    }
}
