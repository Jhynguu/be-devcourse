class Parent {
    String p = "박문수";
    void viewParent() {
        System.out.println("Parent viewParent");
    }
}

class Child extends Parent{
    String c = "임꺽정";
    String p = "홍길동";
    void viewChild() {
        System.out.println("viewChild");
    }

    void viewParent() {
        System.out.println("Child viewParent");
    }

    void parentView() {
        // 부모의 멤버필드
        System.out.println(super.p);
        // 부모의 메서드
        super.viewParent();

        System.out.println(this);
        // this = super => 의미가 없음, 직첩 출력 x
        // System.out.println(super);
    }
    
}

public class InheritanceEx04 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.c);
        System.out.println(c.p);

        c.viewChild();
        c.viewParent();

        c.parentView();
    }
}