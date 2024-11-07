public class ConditionEx12 {
    public static void main(String[] args) {
        // 삼항연산자(분기)
        // 조건 ? 값1 : 값2;

        char c1 = (10 > 3) ? 'a' : 'b';
        System.out.println(c1);

        int a = 12;
        int b = 10;
        int c = 4;
        char c2 = (c < b && b < a) ? 'a' : 'b';
        System.out.println(c2);

        // 조건에 의한 분기
        // 선택 / 필터링
    }
}