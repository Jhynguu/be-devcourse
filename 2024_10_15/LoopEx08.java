public class LoopEx08 {
    public static void main(String[] args) {

        // 처음과 끝 : 유한루프
        for(int i = 1; i <= 5; i++) {
            
        }

        // 무한루프 => 잘못쓰면 시스템이 정지
        // 프로그램 필요에 따라 무한루프 사용 가능
        // 조건이 성립이 잘못
        // for(;;) {

        // }

        // int i = 1;
        // for (; i <= 5; i++) {
        //     System.out.println("Hello");
        // }

        // 초기식 / 조건식 / 증감식 => 1개 이상에 가능
        for (int i = 10, j = 5; i <= 5 || j <= 10; i++, j++) {
            System.out.println(i + " / " + j);
        }
    }
}