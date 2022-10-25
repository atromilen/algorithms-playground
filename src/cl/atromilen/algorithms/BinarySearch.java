package cl.atromilen.algorithms;

import java.util.Arrays;
import java.util.Optional;

public class BinarySearch {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Integer numberToFind = 13;
        var result = binarySearch(numbers, numberToFind);
        if (result.isPresent()){
            System.out.printf("%nNumber found at index %s", result);
        } else {
            System.out.println("Number not found!");
        }
    }

    /**
     * This method receives as parameter an array of integers where to find and a number to find. If
     * the number exists in the list, this method will return the index of the element, otherwise
     * it will be empty (using Java Optional).<br/><br/>
     * The <b>logarithmic time</b> (or <b>log time</b>) for Binary search is O(log n). <br/>
     * e.g. If we receive a list of 16 numbers, this means the search will take 4 steps in the
     * worst-case scenario, due <i><b>log 2 (16) = 4</b></i><br/><br/>
     * Constraints: The list MUST be sorted
     * @param arr the integer's array where to look for
     * @param number the number to found
     * @return the index of found element of Optional.empty()
     */
    public static Optional<Integer> binarySearch(Integer[] arr, Integer number){
        System.out.printf("Binary search: looking for number %d in list %s%n", number, Arrays.toString(arr));
        int low = 0;
        int high = arr.length - 1;
        // It's used to demonstrate the operation that takes the algorithm (try to force the worst-case scenario!).
        int numberOfOperations = 0;

        Optional<Integer> numberFoundAtIndex = Optional.empty();

        while (low <= high){
            numberOfOperations++;
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == number){
                numberFoundAtIndex = Optional.of(mid);
                break;
            } else {
                if (guess > number)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }

        System.out.printf("%nNumber of operations used for search: %d%n", numberOfOperations);

        return numberFoundAtIndex;
    }

}
