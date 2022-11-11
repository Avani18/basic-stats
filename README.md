#Basic Statistics

A Java-based implementation for descriptive statistics. This
implementation is merely intended to be used in the CS520/620 course.

### How to build and run (from Terminal):

1. Make sure that you have Apache Ant installed. Run each ant command in the basic-stats folder, which contains the `build.xml` build file.

2. Run `ant document` to generate the javadoc (a hypertext description) for all of the java classes. Generated hypertext description will be in the `jdoc` folder. Open the `index.html` file.

3. Run `ant compile` to compile all of the java classes. Compiled classes will be in the `bin` folder.

4. Run `ant test` to run all unit tests.

### How to run (from Terminal):

1. After building the project (i.e., running `ant`), run the following command in the basic-stats folder:
   `java -cp bin BasicStatsApp`

### How to clean up (from Terminal):

1. Run `ant clean` to clean the project (i.e., delete all generated files).

Program features:

* Displays a set of entered numbers.
* Computes the mean of the set of numbers.
* Computes the median of the set of numbers.

Functionalities/features added:
1. Added the view and computation function to calculate the maximum number in an array.
2. Added input validation at GUI level when a new number is added to the model. It displays a popup error message if the input number is invalid.
3. Added input validation in the mean, median, mode and max function in BasicStats.java which checks for empty array and null array.
4. Fixed the bug in the configuration after Reset button and tested it too. It clears the input number text field also when the reset button is clicked. 
