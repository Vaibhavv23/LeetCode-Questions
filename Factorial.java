public class Factorial {

    static int printFactorial(int x) {
        int temp = x;
        int fac = 1;
        if(temp == 0) {
            return 1;
        }
        while(temp != 0) {
            fac = fac * temp;
            temp--;
        }
        return fac;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(printFactorial(number));
    }
}
