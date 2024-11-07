public class LoopEx16 {
    public static void main(String[] args) {
        System.out.println("시작");

        // 중첩 반복문의 break
        int i = 0;
        while (i <= 5) { // 1. 외부 반복문
            i++;

            int j = 0;
            while (j <= 5) { // 2. 내부 반복문
                j++;

                if (j == 3) {
                    // break; // 가장 가까운 반복문(2)를 탈출한다. : j가 3에서 끊김
                    continue; // 가장 가까운 반복문(2)을 skip한다. : j가 3을 뛰어넘음
                }
                System.out.println(i + " / " + j);
            }
        }

        System.out.println("끝");
    }
}