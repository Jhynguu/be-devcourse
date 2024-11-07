class Method {

    void gugudan(int a) {
        for( int i =1; i < 10; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
        }
        System.out.println("===========================");
    }
}

public class MethodMainEx02 {
    public static void main(String[] args) {
        // 구구단 단수를 입력받아서 구구단을 출력 gugudan 메서드 작성
        Method m = new Method();

        for ( int i = 1; i < 10; i++) {
            m.gugudan(i);
        }
    }
}