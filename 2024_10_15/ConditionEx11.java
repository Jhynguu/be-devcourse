public class ConditionEx11 {
    public static void main(String[] args) {
        /*
        점수 ( score )
        점수가 90점 이상 - A를 출력
        점수가 80점 이상 - B를 출력
        점수가 70점 이상 - C를 출력
        점수가 60점 이상 - D를 출력
        기타            - F를 출력
        */

       System.out.println("시작");

       int score = 88;

       switch (score / 10) {
        case 9 :
            System.out.println("A");
            break;
        case 8 :
            System.out.println("B");
            break;
        case 7 :
            System.out.println("C");
            break;
        case 6 :
            System.out.println("D");
            break;
        default :
            System.out.println("F");
            break;
       }

       System.out.println("끝");
    }
}