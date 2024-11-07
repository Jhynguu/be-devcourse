class Constructor {
    // 생성자가 없으면 컴파일러 자동생성 : default 생성자
    // 수동 생성
    Constructor() {
        System.out.println("생성자 호출");
    }
}

public class ConstructorMainEx01 {
    public static void main(String[] args) {
        // 인스턴스화

        // new Consturctor() => new + 생성자 호출
        // 생성자는 독립적으로 호출할 수 없음
        // new가 메모리를 생성하여 자동 호출
        Constructor c = new Constructor();
    }
}