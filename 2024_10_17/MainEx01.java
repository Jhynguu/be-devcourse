class Main {
    Main() {
        System.out.println("Main 생성자 호출");
    }
}

public class MainEx01 {

    int instanceVariable = 10;
    static int classVariable = 20;

    MainEx01() {
        System.out.println("MainEx01 생성자 호출");
    }
    public static void main(String[] args) {
        Main m = new Main();

        // instanceVariable / classVariable
        System.out.println(MainEx01.classVariable);

        MainEx01 me = new MainEx01();
        // System.out.println(this.instanceVariable);
        System.out.println(me.instanceVariable);
    }
}