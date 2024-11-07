public class ConditionEx08 {
    public static void main(String[] args) {
        /*
            시간
            6시부터 9시까지를 - 아침
            9시부터 12시까지를 - 아점
            12시부터 15시까지를 - 점심
            15시부터 18시까지를 - 저녁
        */

       System.out.println("시작");

       int time = 14;

       if (time <= 12) {
        if (time <= 9) {
            System.out.println("아침");
        } else {
            System.out.println("아점");
        }
       } else if (time <= 15) {
        System.out.println("점심");
       } else {
        System.out.println("저녁");
       }
       
       System.out.println("끝");
    }
}