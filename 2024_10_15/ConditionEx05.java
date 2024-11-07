public class ConditionEx05 {
    public static void main(String[] args) {
        // 문제
        // 나이(age)가 18이상 이면 "선거 가능"이라고 출력하고 18미만이면 "선거 불가능"이라고 출력

        System.out.println("시작");

        int age = 18;
        if (age >= 18) {
            System.out.println("선거 가능");
        } else {
            System.out.println("선거 불가능");
        }
        
        System.out.println("끝");
    }
}