class Method {

    // 메서드 선언
    // 메소드명 - 식별자 규칙
    // 소문자로 시작, 동사를 사용
    void method1() {
        // 실행문
        System.out.println("method1() 실행");
    }

    // argument / parameter
    void method2(int a) {
        System.out.println("method2() 호출 : " + a);
    }

    // 인자가 여러개
    void method3(int a, int b, int c) {
        System.out.println("method3() 호출 : " + a);
        System.out.println("method3() 호출 : " + b);
        System.out.println("method3() 호출 : " + c);
    }

    // return : return은 반드시 하나
    // void : return이 없음을 나타내는 예약어
    int method4() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

    int method5(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class MethodMainEx01 {
    public static void main(String[] args) {
        Method m = new Method();

        // 메서드의 호출
        m.method1();
        m.method2(10);

        m.method3(20, 30, 40);
        // m.method3(20, 30); // argument 개수와 매개변수의 개수가 차이가 나면 컴파일 오류!

        int result = m.method4(); // method4의 결과값을 받아와 리턴 타입의 변수에 저장
        System.out.println(result); // 30

        result = m.method5(30, 40);
        System.out.println(result); // 70
    }
}