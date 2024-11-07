public class LoopEx18 {
    public static void main(String[] args) {
        // while / continue
        // 1~100까지 짝수의 합
        System.out.println("시작");
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            i++;
            if (i % 2 == 1) {
                continue; // 홀수일때는 누적을 하지 않음
            }
            sum += i;
        }

        System.out.println(sum);

        System.out.println("끝");
    }
}