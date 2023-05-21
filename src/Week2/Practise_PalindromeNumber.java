package Week2;

public class Practise_PalindromeNumber {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(4));
    }
}
