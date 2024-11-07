public class ArrayEx13 {
    // 메인 메서드
    // argument
    public static void main(String[] args) {
        System.out.println("입력 개수 : " + args.length);
        // 1. for
        // 2. 향상된 for -> 이게 더 편함
        for( String arg : args ) {
            System.out.print( arg + ", ");
        }
        System.out.println();
    }
}