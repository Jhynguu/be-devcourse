public class OperatorEx01 {
    public static void main(String[] args) {
        // 이항 연산자 - 산술 연산자
        // + = X /(나누기) %(나머지)

        // 나머지 - 정수
        // 일련의 숫자를 구룹화(홀수, 짝수)
        // 1 % 2 = 1
        // 2 % 2 = 0
        // 3 % 2 = 1
        // 4 % 2 = 0

        // 짝수와 홀수
        System.out.println(1 % 2);
        System.out.println(2 % 2);
        System.out.println(3 % 2);
        System.out.println(4 % 2);

        // 나눗셈
        System.out.println(2 / 2);
        // 1.5 : 자료형
        // 정수 / 정수 = 정수 => 1
        System.out.println(3 / 2);
        System.out.println(5 / 2);
        // 자료형 변환
        System.out.println(5 / 2.0);
        System.out.println(5 / (double)2);

        // 변수
        int i1 = 5;
        int i2 = 2;
        // int result = i1 / i2;
        double result = i1 / (double)i2;
        System.out.println(result);
    }
}