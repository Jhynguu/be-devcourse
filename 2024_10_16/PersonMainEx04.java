class Person {
    // member field
    String name;
    int age;
    String jumin;
    double height;
    double weight;
    
    // method
    void smile() {
        System.out.println( "웃다" + this );
        System.out.println( "웃다" + this.name );
    }

    void eat() {
        System.out.println( "먹다" );
    }

    void sleep() {
        System.out.println( "자다" );
    }
}

public class PersonMainEx04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "이순신";
        p2.name = "강감찬";

        // System.out.println( p1 ); // Person@4517d9a3
        // System.out.println( p2 ); // Person@372f7a8d

        p1.smile();
        p2.smile();
    }
}