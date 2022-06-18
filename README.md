# Problem 1 - Dynamic Int Array

## Assignment

1. You are to implement a class in the `src/main/java` folder called "DynamicIntArray"
2. The class has the following `protected` member variables
    1. `array` - this is of type `int[]`
    2. `elements` - this is of type `int`
3. The class has one constructor that takes a single `int` argument called "initialSize". 
    1. The constructor initializes the `array` member variable to a `int[]` of the given initialSize.
    2. The `elements` member variable is set to 0.
4. The class implements two `public` methods:
    1. `append` - takes a single `int` argument `num` which is the number that should be ended __TO THE END OF THE ARRAY__. If the array is full, double the size of the array and copy all elements into the newly resized array.

    2. `popIndex` - takes a single `int` argument`index` which is the index in the array that you should return (if it exists). If that index does not __OR__ the number of elements that have been added should not have reached that index, it throws an `IndexOutOfBoundsException`.

## Testing

### Option 1

1. Checkout this repository
2. Create a new branch called "[student-name]-sol"
3. Implement the above.
4. Call `git push -u origin HEAD` (the first time) - subsequent times just call `git push`.
5. In github, click the actions tab. You will see your tests run

### Option 2

1. Checkout this repository
2. Run `./gradlew test` (linux) `./gradlew.bat test` (windows) - results will be displayed.