class Util {
    void doCalculator(double a, char operator, double b) {
        double result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
                break;
        }
    }
}

public class DocalculatorEx01 {
    public static void main(String[] args) {
        Util util = new Util();

        util.doCalculator(10, '+', 5);
        util.doCalculator(10, '-', 5);
        util.doCalculator(10, '*', 5);
        util.doCalculator(10, '/', 5);
        util.doCalculator(10, '/', 0);
    }
}