public class LoopEx12 {
    public static void main(String[] args) {
        // while도 중첩문이 가능!
        // 가독성 측면에서 for문과 비교해서 선택
        System.out.println("시작");
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.println(i + " / " + j);
                j++;
            }
            i++;
        }
        System.out.println("끝");
    }
}