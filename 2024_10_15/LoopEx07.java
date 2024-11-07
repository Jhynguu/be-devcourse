public class LoopEx07 {
    public static void main(String[] args) {
        // 1 ~ 100 까지 짝수의 합

        System.out.println("시작");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 ==0) {
                sum += i;
            }
        }

        System.out.println("합계 : " + sum);

        System.out.println("끝");
    }
}