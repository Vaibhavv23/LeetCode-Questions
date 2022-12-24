public class CountDigits {

    static int countingDigits(int num) {
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 567;
        System.out.println(countingDigits(number));
    }
}
