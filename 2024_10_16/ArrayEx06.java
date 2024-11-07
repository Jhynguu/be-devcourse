public class ArrayEx06 {
    public static void main(String[] args) {
        // 기본 자료형
        // 할당
        int a1 = 10; // 할당
        int a2 = a1; // 할당
        System.out.println(a1); // 10
        System.out.println(a2); // 10

        a2 = 20;
        System.out.println(a1); // 10
        System.out.println(a2); // 20

        // 참조 자료형
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = arr1;

        // 배열 생성, arr1은 배열의 참조값을 가짐
        System.out.println(arr1); // [I@24d46ca6 메모리주소값

        // arr2는 arr1이 참조하는 배열을 참조
        System.out.println(arr2); // [I@24d46ca6

        System.out.println(arr2[0]); // 10
        System.out.println(arr1[0]); // 10

        // arr2를 통해 배열의 첫 번째 요소를 100으로 수정
        arr2[0] = 100;

        // arr2를 통해 배열의 첫 번째 요소를 수정했지만,
        // arr1도 같은 배열을 참조하고 있기 때문에, arr1[0]의 값도 100으로 변경된 상태
        System.out.println(arr2[0]); // 100
        System.out.println(arr1[0]); // 100

    }
}