class Variable {
    // 멤버 필드
    String instanceVariable;
    static String classVariable;

    void doFunc() {
        // 지역 변수
        // {}
        String localVariable1 = "10";
        System.out.println(localVariable1);

        // {} 블럭 => 제어문

        int num1 = 10;
        System.out.println("시작");
        {
            // 재정의 불가능
            // int num1 = 20;
            
            System.out.println("중간");
            int num2 = 20;
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
        System.out.println("끝");
        System.out.println("num1 = " + num1);
        // System.out.println("num2 = " + num2);
    }
}

public class VariableMainEx01 {
    public static void main(String[] args) {
        
        // 가장 넓은 영역
        Variable.classVariable = "10";
        System.out.println(Variable.classVariable);

        // 
        Variable v = new Variable();
        v.instanceVariable = "10";
        System.out.println(v.instanceVariable);

        v.doFunc();
         // 지역 변수는 영역 밖에서 사용 불가능
        // v.localVariable1 = "10";
    }
}