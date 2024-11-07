// 가변인자(Varargs) : 하나의 메서드에 여러 개의 인자를 전달할 수 있도록 하는 기능
class Method {

    void doFunc1(int a) {
        System.out.println("doFunc(int a) 호출");
    }

    // 가변인자
    void doFunc2(int... args) {
        // 내부적으로 배열처럼 처리됩니다.
        System.out.println("doFunc(int ... args) 호출");
        System.out.println(args.length); // 배열처럼 길이 확인 가능

        // 배열처럼 반복문 사용 가능
        for (int arg : args) {
            System.out.print(arg + ", ");
        }
        System.out.println();
    }
}

public class MethodMainEx04 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc1(10);
        // m.doFunc1(10, 20); // 일반 매개변수에는 갯수에 맞지 않으면 에러

        // 가변인자 : 0개 이상의 인자를 가변적으로 전달할 수 있다.
        m.doFunc2(10);
        m.doFunc2(10, 20);
        m.doFunc2(10, 20, 30, 40);

    }
}