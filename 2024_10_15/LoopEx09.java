public class LoopEx09 {
    public static void main(String[] args) {
        // 중첩 반복문
        // 반복문이 하나 : 1차원
        // 반복문이 둘 중첩 : 2차원
        // 반복문이 셋 중첩 : 3차원

        System.out.println("시작");

        // 반복 횟수를 주의
        // 외부(5) * 내부(5) => 25
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ? "); // 5회 반복

            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " / " + j); // 5 * 5 = 25회 반복
            }
        }
        System.out.println("끝");
    }
}