class Calculator {
    void calculate(String operation, int a, int b) {
        switch (operation) {
            case "+" :
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-" :
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "X" :
                System.out.println(a + " X " + b + " = " + (a * b));
                break;
            default :
                System.out.println("잘못된 연산");
                break;
        }
    }
}

public class CalculatorEx01 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int a = 10;
        int b = 10;

        c.calculate("X", a, b);
        c.calculate("+", a, b);
        c.calculate("-", a, b);
    }
}