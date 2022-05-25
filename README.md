# CompactBoolArray (Also known as PackedBoolArray)
A compact boolean array that takes only 1 bit per boolean value instead of 1 byte.
Uses floor((numberOfBooleanValues) - 1) / 8 + 3) bytes of memory.
Includes out of bounds checks. 
Starts being more memory efficient than boolean[] at 3-4 boolean values and increases in memory usage efficiency the more indexes there are. 

## Note
This is just here for inspiration and uses essentially a custom implementation of BitSet. If you are using this in production-grade applications, you should develop your own class using BitSet instead.

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
