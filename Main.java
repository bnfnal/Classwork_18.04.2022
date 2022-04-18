import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Task 1: Lario and Muigi Pipe Problem
        
        System.out.println("Task 1: Lario and Muigi Pipe Problem");
        System.out.println("Введите отсортированный по возвастанию массив целых чисел");
        String[] str = sc.nextLine().split(" ");
        int[] r = new int[str.length];
        for (int i = 0; i < str.length; i++) 
        {
            r[i] = Integer.parseInt(str[i]);
        }
        System.out.println("Массив со всеми недостающими элементами:");
        int[] res = PipeFix.pipeFix(r);
        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        // Task 2: Bit Counting
        
        System.out.println("Task 2: Bit Counting");
        System.out.println("Введите натуральное число");
        int n = sc.nextInt();
        System.out.print("Количество единиц в двоичном представлении этого числа = ");
        System.out.print(BitCounting.countBits(n));
        System.out.println();
        System.out.println();
    }
    
    // Task 1: Lario and Muigi Pipe Problem
    
    public static class PipeFix
    {
        public static int[] pipeFix(int[] numbers)
        {
            int[] res = new int[numbers[numbers.length-1] - numbers[0] + 1];
            int k = 0;
            for (int i=numbers[0]; i<=numbers[numbers.length-1]; i++)
            {
                res[k] = i;
                k += 1;
            }
            return res;
        }
    }
    
    // Task 2: Bit Counting
    
    public static class BitCounting 
    {
	   public static int countBits(int n)
       {
		  int k = 0;
          while (n>0)
          {
             k += n%2;
             n = n/2;
          }
          return k;
	    }
    }
    
}
