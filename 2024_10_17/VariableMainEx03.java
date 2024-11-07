class Variable {
    // 인스턴스 멤버 필드 - 자동 초기화
    String instanceVariable;    // null
    int instanceVariable2;      // 0
    char instanceVariable3;     // ''

    void doFunc() {
        // 지역변수 - 반드시 초기화해야 사용할 수 있음
        String localVariable;
        // System.out.println("localVariable = " + localVariable);
    }
}

public class VariableMainEx03 {
    public static void main(String[] args) {
        Variable v = new Variable();

        // 초기화 없이 멤버 필드의 내용 확인
        System.out.println("instanceVariable = " + v.instanceVariable);
        System.out.println("instanceVariable2 = " + v.instanceVariable2);
        System.out.println("instanceVariable3 = " + v.instanceVariable3);

        v.doFunc();
    }
}

