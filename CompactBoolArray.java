

public class CompactBoolArray {
    private byte[] bitArray;
    private int numBits;
    public CompactBoolArray(int length) {
        this.numBits = length;
        this.bitArray = new byte[(int) Math.floor((length - 1) / 8.0) + 1];
    }

    public void set(int index, boolean value) {
        if (index >= numBits) {throwException();}
        int byteNum = (int) Math.floor((index) / 8.0);
        int bitNum = (index % 8);
        if (value) {
            this.bitArray[byteNum] = (byte) (this.bitArray[byteNum] | (1 << bitNum));
            return;
        }
        this.bitArray[byteNum] = (byte) (this.bitArray[byteNum] & ~(1 << bitNum));
    }

    public void toggle(int index) {
        if (index >= numBits) {throwException();}
        int byteNum = (int) Math.floor((index) / 8.0);
        int bitNum = (index % 8);
        if (get(index)) {
            this.bitArray[byteNum] = (byte) (this.bitArray[byteNum] & ~(1 << bitNum));
            return;
        }
        this.bitArray[byteNum] = (byte) (this.bitArray[byteNum] | (1 << bitNum));
    }

    public boolean get(int index) {
        if (index >= numBits) {throwException();}
        int byteNum= (int) Math.floor((index) / 8.0);
        int bitNum = (index % 8);
        return (this.bitArray[byteNum] & (1 << bitNum)) != 0;
    }

    public void print() {
        StringBuilder fullBitValue = new StringBuilder();
        StringBuilder singleBitValue = new StringBuilder();
        for (int i = 0; i < bitArray.length; i++) {
            singleBitValue.setLength(0);
            for (int ii = 0; ii < 8; ii++) {
                try {
                    if (get(8 * i + ii)) {
                        singleBitValue.append("1");
                    } else {
                        singleBitValue.append("0");
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
            singleBitValue.append(" ");
            fullBitValue.append(singleBitValue);
        }
        System.out.println(fullBitValue);
    }

    private void throwException() {
        throw new ArrayIndexOutOfBoundsException();
    }
}
