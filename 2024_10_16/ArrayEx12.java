public class ArrayEx12 {
    public static void main(String[] args) {
        
        // 가변 배열
        int[][] arr1 = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[1];

        arr1[0][0] = 10;
        arr1[2][0] = 20;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][0]);

        int[][] arr2 = { {10, 20, 30}, {40, 50}, {60}};
        System.out.println(arr2[0][0]);
        System.out.println(arr2[2][0]);
    }
}