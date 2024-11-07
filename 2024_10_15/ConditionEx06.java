public class ConditionEx06 {
    public static void main(String[] args) {
        // 변수의 값이 짝수면 "짝수" 출력하고 홀수면 "홀수" 출력

        System.out.println("시작");

        int data = 10;

        if (data % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        System.out.println("끝");
    }
}