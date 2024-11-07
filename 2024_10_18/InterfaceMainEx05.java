interface InterA {
    void methodA();
    // 기본으로 존재해야할 메서드
    default void methodB() {
        System.out.println("methodB 호출");
    }
}

class ClassA implements InterA {
    public void methodA() {
        System.out.println("methodA 호출");
    }
}

public class InterfaceMainEx05 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}