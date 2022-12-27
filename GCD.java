public class GCD {

    // way 1 using loop...O(min(a,b))
//    static int printGcd(int a, int b) {
//        int minNum = Math.min(a, b);
//        while(minNum > 0) {
//            if(a%minNum == 0 && b%minNum == 0) {
//                break;
//            }
//            minNum--;
//        }
//        return minNum;
//    }

    //way 2 using Euclidean algo(repetitive subtraction)
//    static int printGcd(int a, int b) {
//        while(a != b) {
//            if(a > b) {
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//        }
//        return a;
//    }

    //way 3 using optimized Euclidean algo(modular division)
    static int printGcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return printGcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println(printGcd(num1, num2));
    }
}
