class Parent {
    // final 메서드는 자식이 오버라이딩 불가능
    final void viewParent() {
        System.out.println("Parent viewParent");
    }
}

class Child extends Parent {
    // 상수화된 멤버 필드 => 값을 수정하지 못함
    // 이렇게 쓰는 경우가 흔치 않음
    // final String name = "홍길동";
    // final과 static은 거의 한 쌍
    final static String NAME = "홍길동";

    void viewChild() {
        // 상수화된 지역 변수
        final String name = "박문수";
        System.out.println(name);
        // name = "홍길동";
    }

    // 오버라이딩
    void viewParent() {
        System.out.println("Child viewParent");
    }
}

public class FinalMainEx01 {
    public static void main(String[] args) {
        Child c = new Child();
        // System.out.println(c.name);

        // c.name = "박문수";
        c.viewChild();

        c.viewParent();
    }
}