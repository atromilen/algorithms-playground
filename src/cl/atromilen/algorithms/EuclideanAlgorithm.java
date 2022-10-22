package cl.atromilen.algorithms;

public class EuclideanAlgorithm {

    public static void main(String[] args) {
        var result = getGreatestCommonDivisor(1680, 640);
        System.out.printf("result: %s", result);
    }

    /**
     * This method calculate the Greatest Common Divisor (GCD) between 2 numbers, following the Euclidean Algorithm
     * technique to obtain this GCD. This is very useful when we need to get the smallest possible area in a
     * plot that we want to divide in equals parts.
     * @param biggest the biggest side in an area
     * @param lowest the smaller side in an area
     * @return the smallest possible area that can divide the original size of a plot.
     */
    public static Integer getGreatestCommonDivisor(int biggest, int lowest){
        if((biggest % lowest)== 0) {
            return lowest;
        } else {
            return getGreatestCommonDivisor(lowest, biggest % lowest);
        }
    }
}
