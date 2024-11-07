public class LoopEx02 {
    public static void main(String[] args){
        // 1 ~ 20까지 중 3배의 배수를 출력
        
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 3; i <= 20; i += 3) {
            System.out.println(i);
            }
    }
}