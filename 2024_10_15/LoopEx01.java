public class LoopEx01 {
    public static void main(String[] args) {
        // Hello World 5번 출력

        System.out.println("시작");

        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hello World");

        // 반복횟수
        // 수열
        for( int i = 1; i <= 5; i++) {
            System.out.println("Hello World : " + i);
        }
        // 1 ~ 10 출력
        for( int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 1 ~ 10 중 홀수만 출력
        for (int i = 1; i <= 10; i+=2) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }

        System.out.println("끝");
    }
}