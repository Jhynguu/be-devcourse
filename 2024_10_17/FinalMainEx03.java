// 상속 불가
final class Parent {
    Parent() {
        System.out.println("Parent 생성자");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child 생성자");
    }
}

public class FinalMainEx03 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}