class This {
    This() {
        System.out.println("생성자 호출");
    }

    This(String name) {
        // This();
        this();
        System.out.println("생성자 오버로딩 호출");
        // this();
    }
}

public class ThisMainEx01 {
    public static void main(String[] args) {
        This t = new This("홍길동");

    }
}