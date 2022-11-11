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
        // If array is null, throw IllegalArgumentException
        if (numbers == null)
        {
            throw new IllegalArgumentException("array is null");
        }

        // If array is empty, throw IllegalArgumentException
        if (numbers.length == 0)
        {
            throw new IllegalArgumentException("array is empty");
        }

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
        // If array is null, throw IllegalArgumentException
        if (numbers == null)
        {
            throw new IllegalArgumentException("array is null");
        }

        // If array is empty, throw IllegalArgumentException
        if (numbers.length == 0)
        {
            throw new IllegalArgumentException("array is empty");
        }

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
        // If array is null, throw IllegalArgumentException
        if (numbers == null)
        {
            throw new IllegalArgumentException("array is null");
        }

        // If array is empty, throw IllegalArgumentException
        if (numbers.length == 0)
        {
            throw new IllegalArgumentException("array is empty");
        }

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

    /**
     * Compute the max of an array of numbers.
     */
    public static double max(double ... numbers) {
        // If array is null, throw IllegalArgumentException
        if (numbers == null)
        {
            throw new IllegalArgumentException("array is null");
        }

        // If array is empty, throw IllegalArgumentException
        if (numbers.length == 0)
        {
            throw new IllegalArgumentException("array is empty");
        }

        // Initialize maxNumber to negative infinity
        double maxNumber = Double.NEGATIVE_INFINITY;

        // Iterate through the list of numbers
        for (double num: numbers)
        {
            if (num > maxNumber)
            {
                maxNumber = num;
            }
        }

        // Return maximum number
        return maxNumber;
    }
}
