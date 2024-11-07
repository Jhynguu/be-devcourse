class Constructor {
    // 멤버 필드가 많아지면 다양한 초기화 필요 => 다양한 생성자 필요
    String hakbun;
    String name;
    Constructor() {
        // 전체를 디폴트 값으로 초기화하는 생성자
        this.hakbun = "0000";
        this.name = "아무개";
    }

    Constructor(String name) {
        // 학번만 디폴트 값으로 초기화하는 생성자
        this.hakbun = "0000";
        this.name = name;
    }

    Constructor(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }
}

public class ConstructorMainEx03 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();                 // 전체
        System.out.println(c1.hakbun);
        System.out.println(c1.name);

        Constructor c2 = new Constructor("홍길동");         // 학번
        System.out.println(c2.hakbun);
        System.out.println(c2.name);

        Constructor c3 = new Constructor("1111", "박문수");
        System.out.println(c3.hakbun);
        System.out.println(c3.name);
    }
}