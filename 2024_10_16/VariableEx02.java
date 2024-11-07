class Variable {
    String instanceVariable;
    static String classVariable;

    // 인스턴스 메서드
    void doFunc1() {
        System.out.println("doFunc1() 호출 : " + this.instanceVariable);
    }

    // 클래스 메서드
    static void doFunc2() {
        System.out.println("doFunc2() 호출 : ");
        // System.out.println("doFunc2() 호출 : " + this.instanceVariable);
    }    
}

public class VariableEx02 {
    public static void main(String[] args) {
        // Variable v1 = new Variable();
        // Variable v2 = new Variable();

        // v1.instanceVariable = "홍길동";
        // v2.instanceVariable = "박문수";

        // v1.doFunc1();
        // v2.doFunc1();

        // v1.doFunc2();
        // v2.doFunc2();
        Variable.doFunc2();
    }
}