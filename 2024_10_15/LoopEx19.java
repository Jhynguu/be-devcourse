public class LoopEx19 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            // 행
            for(int j = 1; j <= i; j++) {
            // for(int j = 1; j <= 10; j++) {
                // 열
                System.out.print("*");
                }
            System.out.println();
        }
     }
}