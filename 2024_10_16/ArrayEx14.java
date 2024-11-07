public class ArrayEx14 {
    public static void main(String[] args) {

        // 암기
        // String의 형변환
        // String -> int : Integer.parseInt()
        // String -> double : Double.parseDouble()

        String str1 = "1";
        String str2 = "2";

        // 문자열 연결 연산자
        System.out.println(str1 + str2); // 12

        // 산술
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 3

        // cmd> java ArrayEx14 10 20
        System.out.println(args[0] + args[1]); // 1020
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])); // 30
    }
}