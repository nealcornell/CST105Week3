package Primepalindromes;
 
public class Primesandpalindromes {

public static void main(String[] args) {
//  Every line needed to get every palindromic prime number between 0-100,000
final int total = 115;

        final int displayPerLine = 1;
        int count = 1;
        int number = 0;     
        while (count <= total) {
              if (isPrime(number) && isPalindrome(number)) {
                 System.out.print(number + " ");
                 if (count % displayPerLine == 0)
                 System.out.println();
                 count++;
              } 
              number++;
              }
}
/* Test if the number is Prime */
    public static boolean isPrime(int num) {
        if (num == 2)
           return true;
        for (int divisor = 2; divisor <= num/2; divisor++) {
            if (num % divisor == 0)
               return false;
        }
        return true;
    } 
    public static int reverse(int num) {
        int test = 0;
        while (num != 0) {
              int lastdigit = num % 10;
              test = test * 10 + lastdigit;
              num = num / 10;
        }
        return test;
    }   
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
}

    

