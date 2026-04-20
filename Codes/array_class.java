import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        // Print the key and corresponding index
        System.out.println(
            intKey + " found at index = "
            + Arrays.binarySearch(intArr, intKey));
    }
}