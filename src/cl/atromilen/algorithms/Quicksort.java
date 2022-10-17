package cl.atromilen.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quicksort {

    public static Integer[] quicksort(Integer[] numsArr) {
        if (numsArr.length < 2) return numsArr; // base case: return if there is 1 or no elements
        else { // recursive case
            int pivot = numsArr[0]; //we will take 1st index as pivot
            var newArray = excludeIndexFromArray(numsArr); //It's necessary to re-arrange the array

            // Using the pivot, build two sublists with less and greager elements regard to pivot.
            var less = Arrays.stream(newArray).filter((Integer i) -> i < pivot).toArray(Integer[]::new);
            var greater = Arrays.stream(newArray).filter((Integer i) -> i >= pivot).toArray(Integer[]::new);
            System.out.printf("%s <%s> %s %n", Arrays.toString(less), pivot, Arrays.toString(greater));

            // sort recursively the two lists
            less = quicksort(less);
            greater = quicksort(greater);

            // It's necessary to append the pivot to the less list, before to merge it with the greater list
            var left = Arrays.copyOf(less, less.length + 1);
            left[left.length - 1] = pivot;

            //Concatenating both sorted lists
            return Stream.concat(Arrays.stream(left), Arrays.stream(greater))
                    .toArray(size -> (Integer[]) Array.newInstance(left.getClass().getComponentType(), size));

        }
    }

    private static Integer[] excludeIndexFromArray(Integer[] numbers) {
        return IntStream.range(0, numbers.length)
                .filter(i -> i != 0)
                .map(i -> numbers[i])
                .boxed()
                .toArray(Integer[]::new);
    }


    public static void main(String[] args) {
        Integer[] numbers = {9, 10, 5, 2, 3, 77, 1, 24, 11, 5};
        System.out.printf("unordered numbers: %s%n", Arrays.toString(numbers));
        Integer[] sortedList = quicksort(numbers);
        System.out.printf("ordered numbers: %s%n", Arrays.toString(sortedList));
    }
}
