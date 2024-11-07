class Constructor {
    // 멤버 필드
    String name;
    Constructor() {
        System.out.println("생성자 호출");
        this.name = "홍길동";
    }

    Constructor(String name) {
        // 메서드 내부에서 멤버 필드와 지역 변수를 구분 => this
        this.name = name;
    }
}

public class ConstructorMainEx02 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1.name);

        Constructor c2 = new Constructor("박문수");
        System.out.println(c2.name);
    }
}