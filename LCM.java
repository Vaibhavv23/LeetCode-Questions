public class LCM {

    static int printGcd(int a, int b) { // finding gcd(a,b)
        if(b == 0) {
            return a;
        } else {
            return printGcd(b, a%b);
        }
    }

    static int printLcm(int a, int b) {
        return a * b / printGcd(a, b); // formula for lcm = a*b/gcd(a,b)
    }

    public static void main(String[] args) {
        int num1 = 4, num2 = 6;
        System.out.println(printLcm(num1, num2));
    }
}
