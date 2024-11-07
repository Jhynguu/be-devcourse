// 다형성
// 부모(일반 클래스, 추상클래스, 인터페이스) -> 자식의 메서드로 호출
interface Employee {
    void salary();
}

class Child1Employee implements Employee {
    public void salary() {
        System.out.println("Child1Employee salary 호출");
    }
}

class Child2Employee implements Employee {
    public void salary() {
        System.out.println("Child2Employee salary 호출");
    }
}

public class InterfaceMainEx04 {
    public static void main(String[] args) {
        Employee e1 = new Child1Employee();
        Employee e2 = new Child2Employee();

        e1.salary();
        e2.salary();
    }
}