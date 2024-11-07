class Variable {
    // 인스턴스 멤버 필드
    String instanceVariable;

    void doFunc() {
        // 지역 변수
        String instanceVariable = "20";
        System.out.println("doFunc() 호출 : " + instanceVariable);
        System.out.println("doFunc() 호출 : " + this.instanceVariable);
    }

    // 메서드의 argument도 지역 변수
    void doFunc2(String instanceVariable) {
        System.out.println("doFunc2() 호출 : " + instanceVariable);
        System.out.println("doFunc2() 호출 : " + this.instanceVariable);
    }
}

public class VariableMainEx02 {
    public static void main(String[] args) {

        Variable v = new Variable();

        v.instanceVariable = "10";

        v.doFunc();
        v.doFunc2("20");
    }
}