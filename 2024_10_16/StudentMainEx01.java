// 실행 클래스
public class StudentMainEx01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        // 서로 주소가 다름
        System.out.println( s1 ); // Student@4517d9a3
        System.out.println( s2 ); // Student@372f7a8d
        
    }
}