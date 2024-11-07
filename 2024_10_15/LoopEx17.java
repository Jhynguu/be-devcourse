public class LoopEx17 {
    public static void main(String[] args) {
        System.out.println("시작");

        // 중첩 반복문의 break를 먼 곳의 반복문에 적용하고 싶을 때
        int i = 0;

        outer: // 라벨(label)
        while (i <= 5) { // 1. 외부 반복문
            i++;

            int j = 0;
            while (j <= 5) { // 2. 내부 반복문
                j++;

                if (j == 3) {
                    break outer; // 라벨링한 반복문(1:외부)을 탈출한다.
                    // continue outer; 
                }
                System.out.println(i + " / " + j);
            }
        }

        System.out.println("끝");
    }
}