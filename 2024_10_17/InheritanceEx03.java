class Parent {
    // 디폴트 생성자
    // Parent() {
    //     System.out.println("Parent : " + this);
    // }

    Parent(String name) {
        System.out.println("Parent(String name) : " + this);
    }
}

class Child extends Parent {
    Child() {
        // 부모의 생성자를 호출
        super("홍길동");
        System.out.println("Child : " + this);
        // 생성자의 첫 번째에서 호출 가능
        // super("홍길동");
    }
}

public class InheritanceEx03 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("c : " + c);
    }
}