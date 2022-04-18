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
