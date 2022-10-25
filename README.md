# Algorithms playground
> Writing some algorithms just for fun :)
> This code will be very basic, with no framework or additional plugins in order to be purely functional.
> 
> 
> _Coded by [atromilen](https://github.com/atromilen)_

## Algorithms List
1. [Binary Search](src/cl/atromilen/algorithms/BinarySearch.java): This is one of the most common and basic searching
algorithms, but not for that less effective. The **logarithmic time** or **log time** of a Binary Search is _O(log n)_, 
a lot faster in comparison a Simple Search with a log time of O(n). Remember that **Big O Notations** tell us 
the numbers of operations in the worst-case scenario, as a way to measure the performance of an algorithm. 

2. [Euclidean Algorithm](src/cl/atromilen/algorithms/EuclideanAlgorithm.java): Using the Euclidean algorithm, we can know 
how to get the _Greater Common Divisor (GCD)_ between 2 numbers. In other words, we can obtain the smallest possible 
value to divide 2 numbers. Think in a plot of 1680 * 640 than we need to divide in identical squares. How can we 
determine the smallest square (80) to divide the plot? Things like this we can solve using Euclidean algorithm.
Take a look at this very good explanation about this algorithm
[here](https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm).

3. [Quicksort](src/cl/atromilen/algorithms/Quicksort.java): In this example, we are ordering a list of N elements using
this sorting algorithm, using techniques such as Divide & Conquer and Recursion. In this example we are using a basic
pivot (the first element), but in the way we will improve this algorithm.
