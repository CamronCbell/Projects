import java.util.Random;
import java.util.Arrays;

public class IntArray {

    private int length;
    private int[] myArray;

    public IntArray(int l) {
        length = l;
        myArray = new int[l];
    }

    public int size() {
        return length;
    }

    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    public int get(int element) {
        if (element >= 0 && element < length) {
            return myArray[element];
        }
        return -1;
    }

    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue;
        }
    }

    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void sort() {
        Arrays.sort(myArray);
    }

    public String toString() {
        return Arrays.toString(myArray);
    }
}