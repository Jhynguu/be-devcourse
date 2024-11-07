class Parent {
    void viewParent() {
        System.out.println("Parent viewParent() 호출");
    }
}

class Child extends Parent {
    void viewChild() {
        System.out.println("Child viewChild() 호출");
    }

    // Overriding(재정의)
    // 목적 : 메서드 이름의 통일화
    void viewParent() {
        System.out.println("Child viewParent() 호출");
    }

    // 반환타입이 같아야 한다.
    // int viewParent() {
    //     System.out.println("Child viewParent() 호출");
    //     return 0;
    // }
}

public class InheritanceEx02 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewChild();
        c.viewParent();

        Child c2 = new Child2();
        c2.viewParent();
    }
}