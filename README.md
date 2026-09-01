# Leetcode-Series

### 1.Two Sum

- Difficulty level: Easy
- Language: Java
- Approach: Compare every pair of elements and return the pair whose sum equals the target.
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### 2.Palindrome

- Difficulty level: Easy
- Language: Java
- Approach: Reverse the number and compare it with the original number.
- Time Complexity: O(log n)
- Space Complexity: O(1)

### 3.Fibonacci Number

- Difficulty level: Easy
- Language: Java
- Approach: Iterative approach using give two variables to generate the next fibonacci number.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 4.Build Array from Permutation

- Difficulty level: Easy
- Language: Java
- Approach: Traverse the array and use each value as an index to build the result array.
- Time Complexity: O(n)
- Space Complexity: O(n)

### 5.Concatenation of Array

- Difficulty level: Easy
- Language: Java
- Approach: Traverse the array and append the original array twice to form the concatenated array.
- Time Complexity: O(n)
- Space Complexity: O(n)

### 6.Plus One

- Difficulty level: Easy
- Language: Java
- Approach: Traverse from right to left, add one with carry, and update each digit accordingly.
- Time Complexity: O(n)
- Space Complexity: O(n)

### 7.Running Sum of 1D Array

- Difficulty level: Easy
- Language: Java
- Approach: Traverse the array and add each element to the previous sum.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 8.Remove Element

- Difficulty level: Easy
- Language: Java
- Approach: Traverse the array and keep only elements that are not equal to value.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 9.Best Time to Buy and Sell Stock

- Difficulty level: Easy
- Language: Java
- Approach: Track the minimum buying price and calculate the maximum profit while traversing the array.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 10.Search Insert Position

- Difficulty level: Easy
- Language: Java
- Approach: Traverse the sorted array and return the first index where nums[i] >= target; otherwise return nums.length.
- Time Complexity: O(log n)
- Space Complexity: O(1)

### 11.Richest Customer Wealth

- Difficulty level: Easy
- Language: Java
- Approach: Traverse each customer's account row, calculate the total wealth, and keep track of the maximum wealth.
- Time Complexity: O(n x m)
- Space Complexity: O(1)

### 12.Suffle the Array

- Difficulty Level: Easy
- Language: Java
- Approach: Traverse the first half and second half simultaneously, adding one element from each alternately to the result array.
- Time Complexity: O(n)
- Space Complexity: O(n)

### 13.Kids With the Greatest Number of Candies

- Difficulty Level: Easy
- Language: Java
- Approach: Find the maximum candies, then check whether each kid's candies + extraCandies is greater than or equal to the maximum.
- Time Complexity: O(n)
- Space Complexity: O(n)

### 14.Find Numbers with Even Number of Digits

- Difficulty Level: Easy
- Language: Java
- Approach: Count the digits of each number using a loop and increment the result when the digit count is even.
- Time Complexity: O(n x d)
- Space Complexity: O(1)

### 15.Contains Duplicate

- Difficulty Level: Easy
- Language: Java
- Approach: Sort the array and compare adjacent elements; if any two adjacent elements are equal, a duplicate exists.
- Time Complexity: O(n log n)
- Space Complexity: O(log n)

### 16.Missing Number

- Difficulty Level: Easy
- Language: Java
- Approach: Calculate the expected sum from 0 to n and subtract the actual array sum to find the missing number.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 17.Single Number

- Difficulty Level: Easy
- Language: Java
- Approach: Use nested loops to count the frequency of each element and return the element that appears only once.
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### 18.Single Number II

- Difficulty Level: Medium
- Language: Java
- Approach: Use nested for loops to count how many times each element appears. If the count is 1, return that element.
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### 19.Single Number III

- Difficulty Level: Medium
- Language: Java
- Approach: Traverse the array, count each element’s occurrence, and find the two numbers that occur only once.
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### 20.Intersection of Two Arrays

- Difficulty Level: Easy
- Language: Java
- Approach: Compare each element of nums1 with nums2 and add it to the result only if it matches and is not already added.
- Time Complexity: O(n x m)
- Space Complexity: O(n)

### 21.Maximum Subarray

- Difficulty Level: Medium
- Language: Java
- Approach: Traverse the array once, calculate the maximum subarray sum by keeping a running sum, and update the maximum whenever a larger sum is found.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 22.Majority Element

- Difficulty Level: Easy
- Language: Java
- Approach: Traverse the array using Boyer-Moore Voting Algorithm and maintain a candidate with its count.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 23.Third Maximum Number

- Difficulty Level: Easy
- Language: Java
- Approach: Sort the array in descending order, remove duplicate elements, and return the third distinct element nums[2]; if it doesn’t exist, return nums[0].
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### 24.Find Pivot Index

- Difficulty Level: Easy
- Language: Java
- Approach: Calculate the total sum first, then for each index calculate rightSum = total - leftSum - nums[i] and check whether leftSum == rightSum.
- Time Complexity: O(n)
- Space Complexity: O(1)

### 25.Sort Array By Pivot

- Difficulty Level: Easy
- Language: Java
- Approach: Use two pointers to place all even numbers at the beginning and odd numbers at the end by swapping them.
- Time Complexity: O(n)
- Space Complexity: O(1)
