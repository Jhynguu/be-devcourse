public class ConditionEx10 {
    public static void main(String[] args) {
        /*
            data
            10이면 10을 출력
            20이면 20을 출력
            30이면 30을 출력
            기타   00을 출력
            if
            switch
         */

        System.out.println("시작");

        int data = 20;
        // 조건에 만족하면 밑은 조건은 통과
        // break
        // switch - byte, short, int, char
        // string
        switch(data) {
            case 10 :
                System.out.println("10");
                break;
            case 20 :
                System.out.println("20");
                break;
            case 30 :
                System.out.println("30");
                break;
            default :
                System.out.println("00");
                break;
        }

        String str = "20";

        switch (str) {
            case "10":
                System.out.println("10");
                break;
            case "20":
                System.out.println("20");
                break;
            default :
                System.out.println("00");
        }

        System.out.println("끝");
    }
}