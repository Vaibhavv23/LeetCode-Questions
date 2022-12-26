public class FactorialTrailingZeroes {

    // n time
//        static int trailingZeroes(int x) {
//            int temp = x;
//            int fac = 1;
//            int count = 0;
//            if(temp == 0) {
//                return 0;
//            }
//            while(temp != 0) {
//                fac = fac * temp;
//                temp--;
//            }
//            while(fac % 10 == 0){
//                count++;
//                fac = fac/10;
//            }
//            return count;
//        }

    // Optimized solution with log n time.
    static int trailingZeroes(int x) {
        int count = 0;
        for(int i = 5; i <= x; i = i * 5) {
            count = count + x/i;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(trailingZeroes(number));
    }

}
