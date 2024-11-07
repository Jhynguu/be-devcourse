public class ArrayEx11 {
    public static void main(String[] args) {
        
        // 3차원 배열
        int[][][] arr1 = new int[3][2][3];
        int[][][] arr2 = {
            {
                {1, 2, 3},
                {10, 20, 30}
            },
            {
                {4, 5, 6},
                {40, 50, 60}
            },
            {
                {7, 8, 9},
                {70, 80, 90}
            }
        };

        System.out.println(arr2[0][0][0]);
        System.out.println(arr2[1][1][1]);

        // 기존 for문을 이용해서 전체 데이터 출력
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                for (int k = 0; k < arr2[i][j].length; k++) {
                    System.out.println(arr2[i][j][k]);
                }
            }
        }
    }
}