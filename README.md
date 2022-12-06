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
* Computes the maximum of the set of numbers.    
* Resets the list of numbers and all the values.
* Undo/Removes the last number added(if any).

### Undo Functionality
* Added a button for Undo in `BasicStatsGUI.java` and disabled it initially
* On click, it calls `undoAdd()` method in the same file.
* In the `undoAdd()` method, the model's method `removeLastNumber` is called which removes the number from the data in model. It also updates the model and disables the button if data length is 0.
* On reset, the button is disabled again.
* When a number is added, the button is enabled. 
* When the model is updated, if length of data is not zero, it clears the NumbersView TextArea and gets the latest data from model to display on the TextArea.
* The `removeLastNumber` method in model checks if there is a data element that can be removed and deletes it. Else, it throws an `IllegalArgumentException`.


Collaborators:

* Avani Jindal
* Muskan Jain
* Sahil Jindal