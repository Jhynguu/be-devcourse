public class ArrayEx10 {
    public static void main(String[] args) {
        
        // 선언, 생성, 초기화
        int[][] arr1 = new int[][] { {10, 20}, {30, 40}, {50, 60}};
        int[][] arr2 = { {10, 20}, {30, 40}, {50, 60}};

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]);

        System.out.println("arr1 : " + arr1);
        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[0][0] : " + arr1[0][0]);

        // 행의 개수
        System.out.println("arr1.length : " + arr1.length);
        // 열의 개수
        System.out.println("arr1[0].length : " + arr1[0].length);

        // 전체 데이터 출력
        // for
        // 행 전체에 접근
        for(int i = 0; i < arr1.length; i++) {
            // 각 행에 대한 접근
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }

        // 향상된 for
        for(int[] cols : arr1) {
            for(int data : cols) {
                System.out.println(data);
            }
        }
    }
}