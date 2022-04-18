# Classwork_18.04.2022
 
## Task 1: Lario and Muigi Pipe Problem 
 
### Class:  
                PipeFix 
### Function:    
                pipeFix(int[] numbers) 
 
### Task: 
 
Looks like some hoodlum plumber and his brother has been running around and damaging your stages again. 
The pipes connecting your level's stages together need to be fixed before you receive any more complaints.  
Each pipe should be connecting, since the levels ascend, you can assume every number in the  
sequence after the first index will be greater than the previous and that there will be no duplicates. 
 
Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value. 
 
### Examples: 
 
     Input: 1,3,5,6,7,8 
     Output: 1,2,3,4,5,6,7,8 
 
 
### Favorite solution: 
 
 
      import static java.util.stream.IntStream.rangeClosed; 
      class Kata  
      { 
     static int[] pipeFix(int[] numbers)  
         { 
             return rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray(); 
         } 
      }
      

 
## Task 2: Bit Counting 
 
### Class:  
                BitCounting
### Function:    
                countBits(int n)
 
### Task: 
 
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. 
You can guarantee that input is non-negative.
Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 
### Favorite solution: 
 
 
      public class BitCounting 
      {
         public static int countBits(int n)
         {
            int ret = n % 2;
            while ((n /= 2) > 0) ret += n % 2;
            return ret;
         }
      }
      
      
## Task 3: Playing with digits 
 
### Class:  
                DigPow
### Function:    
                digPow(int n, int p) 
 
### Task: 
 
Some numbers have funny properties. 

For example:
89 --> 8¹ + 9² = 89 * 1
695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
In other words:
Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
If it is the case we will return k, if not return -1.
Note: n and p will always be given as strictly positive integers.
 
### Examples: 
 
 
     digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
     digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
     digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
     digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 
 
### Favorite solution: 
 
 
      public class DigPow 
      {
         public static long digPow(int n, int p) 
         {
             String intString = String.valueOf(n);
             long sum = 0;
             for (int i = 0; i < intString.length(); ++i, ++p)
             sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
             return (sum % n == 0) ? sum / n : -1;
         } 
      }
      

