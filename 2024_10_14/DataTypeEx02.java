public class DataTypeEx02 {
    public static void main(String[] args) {
        // 문자(Charactor)     - 한 자     : '문자' 
        // 문자열(String)      - 문자열    : "문자열"

        char c1 = 'A';
        char c2 = '1';
        System.out.println(c1);
        System.out.println(c2);

        // ascii code
        // 문자를 숫자로 저장하는 방법
        char c3 = 1;
        char c4 = 97;
        char c5 = 67;
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        // 유니코드
        // 다국어
        char c6 = '\uc790';
        System.out.println(c6);
        
    }
}