public class LoopEx03 {
    public static void main(String[] args) {
        // ABCD ~ Z 출력

        for (int i = 65; i < 91; i++) {
            System.out.print((char)i);
        }

        System.out.println();

        // ascii
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}