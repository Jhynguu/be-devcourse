public class LoopEx15 {
    public static void main(String[] args) {
        // break : 반복문을 탈출한다
        System.out.println("시작");
        int i = 0;
        while (i <= 5) {
            i++;
            if (i == 3) {
                // break; // 3일때 반복문을 탈출한다.
                continue; // 3일때 뛰어넘는다.(skip)
            }
            System.out.println(i);
        }
        System.out.println("끝");
    }
}