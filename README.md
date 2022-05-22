# CompactBoolArray
A compact boolean array that takes only 1 bit instead of 1 byte per value.
Uses floor((numberOfBits)-1)/8+3) bytes of memory.
Includes out of bounds checks. 

## Methods
### set(int index, boolean value)
##### return type: void
Sets the boolean value at index

### toggle(int index)
##### return type: void
Toggles the boolean value at index

### get(int index)
##### return type: boolean
Returns the boolean value at index
