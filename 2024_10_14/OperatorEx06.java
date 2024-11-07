public class OperatorEx06 {
    public static void main(String[] args) {
        // 증감 연산자 - 단항연산자
        // ++ / --
        int a = 10;

        // +1
        // a = a + 1;
        // a += 1;
        // a++;
        // ++a;

        a--;

        System.out.println( a );

        int a1 = 10;
        int a2 = 10;
        
        int b1 = ++a1;
        int b2 = a2++;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }
}