class Util {
    void doGugudan(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + "단");
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println("=============");
        }
    }
}

public class DogugudanEx01 {
    public static void main(String[] args) {
        Util util = new Util();

        util.doGugudan(3, 9);
    }
}