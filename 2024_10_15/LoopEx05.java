public class LoopEx05 {
    public static void main(String[] args) {
        // 1 ~ 50 까지 중 2배수이면서 3배수인 값을 출력

        System.out.println("시작");
        
        for (int i = 1; i <= 50; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.print(i + ", ");
            }
        }

        System.out.print("끝");
    }
}