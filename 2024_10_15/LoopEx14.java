public class LoopEx14 {
    public static void main(String[] args) {
        // A ~ Z
        // do ~ while

        System.out.println("시작");

        char ch = 'A';
        do {
            System.out.print(ch);
            ch++;
        } while (ch <= 'Z');

        System.out.println();
        
        System.out.println("끝");
    }
}