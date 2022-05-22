# CompactBoolArray (Also known as PackedBoolArray)
A compact boolean array that takes only 1 bit per boolean value instead of 1 byte.
Uses floor((numberOfBooleanValues) - 1) / 8 + 3) bytes of memory.
Includes out of bounds checks. 
Starts being more memory efficient than boolean[] at 3-4 boolean values and increases in memory usage efficiency the more indexes there are. 

## How to use in your code
Copy the CompactBoolArray.java file into your package folder and create a new CompactBoolArray class.

## Methods
### set(int index, boolean value)
##### return type: void
Sets the boolean value at index.

### toggle(int index)
##### return type: void
Toggles the boolean value at index.

### get(int index)
##### return type: boolean
Returns the boolean value at index.

## Debug use
### print
##### return type: void
Prints binary representation of the array.
