class Variable {
    // 인스턴스 멤버필드
    String instanceVariable;
    // 클래스 멤버필드 : static 키워드로 정의된다.
    // => 모든 객체가 동일한 값을 공유한다.
    static String classVariable;
}

public class VariableEx01 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";

        System.out.println(v1.instanceVariable); // 홍길동
        System.out.println(v2.instanceVariable); // 박문수

        // v1 인스턴스 변수가 바뀌어도 v2의 인스턴스 변수에는 영향 없음
        v1.instanceVariable = "임꺽정";

        System.out.println(v1.instanceVariable); // 임꺽정
        System.out.println(v2.instanceVariable); // 박문수

        // v1의 클래스 변수를 변경했지만, v2의 클래스 변수도 변경된다?
        v1.classVariable = "홍길동";

        System.out.println(v1.classVariable); // 홍길동
        System.out.println(v2.classVariable); // 홍길동

        // v2의 클래스 변수를 변경했지만, v1의 클래스 변수도 변경된다?
        v2.classVariable = "강감찬";

        System.out.println(v1.classVariable); // 강감찬
        System.out.println(v2.classVariable); // 강감찬

        // 공유하는 class변수는 혼동되지 않게 아래처럼 클래스명을 써준다.
        System.out.println(Variable.classVariable);
    }
}