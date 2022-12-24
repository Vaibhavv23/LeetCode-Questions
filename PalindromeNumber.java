public class PalindromeNumber {

    static boolean isPalindrome(int x) {
        int reversedNumber = 0;
        int temp = x;
        while(temp != 0) {
            int y = temp%10;
            reversedNumber = (reversedNumber * 10) + y;
            temp = temp/10;
        }
        return (reversedNumber == x);
    }

    public static void main(String[] args) {
        int number = 6776;
        System.out.println(isPalindrome(number));
    }
}
