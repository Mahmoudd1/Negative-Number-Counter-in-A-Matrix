# Negative-Number-Counter-in-A-Matrix
This repository contains a Java algorithm for counting the number of negative numbers in a given matrix.
## Problem Description
Given a 2D matrix grid of integers, where each row is sorted in non-decreasing order and each column is also sorted in non-decreasing order, we need to count the number of negative numbers in the matrix.
## Algorithm Approach
The solution approach used in this code involves a modified binary search on each row of the matrix to find the index where negative numbers start. By summing the sizes of the sub-matrices that contain negative numbers, we can obtain the count of negative numbers in the matrix. Here's an overview of the updated solution steps:

- Initialize the count of negative numbers to 0.
- Iterate through each row of the matrix.
- Use a binary search algorithm to find the index where negative numbers start in the current row.
- Add the count of negative numbers in the sub-matrix.
- Repeat steps 2-4  until all elements in the matrix have been visited..
- Return the total count, which represents the number of negative numbers in the matrix.

## Code Explanation
The provided code implements the updated solution approach described above. It consists of the following main parts:

The countNegatives method takes a 2D matrix as input and returns the count of negative numbers.
- The method iterates through each row of the matrix using a loop.
- For each row, it performs a binary search to find the index where negative numbers start.
- The count of negative numbers in the sub-matrix is calculated .
- The count of negative numbers in the sub-matrix is added to the total count.
- Finally, the method returns the total count, which represents the number of negative numbers in the matrix.

## Time Complexity Analysis
The time complexity of the solution is dominated by the binary search performed on each row of the matrix. Let's analyze the time complexity:

For each row, the binary search takes O(log(m)) time, where m is the number of columns in the matrix.
Since there are n rows in the matrix, the total time complexity for the binary search step is O(n * log(m)).
The summation of the sub-matrices and other operations in the code take constant time and do not significantly affect the overall time complexity.
Therefore, the overall time complexity of the solution is O(n * log(m)), where n is the number of rows and m is the number of columns in the matrix.

## Space Complexity Analysis
The space complexity of the solution is O(1) because it only uses a few variables to keep track of the count and indices. The space used does not depend on the input size.

