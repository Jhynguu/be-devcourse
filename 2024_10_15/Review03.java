public class Review03 {
    public static void main(String[] args) {
        int totalSum = 0;
        for (int i =1; i <= 10; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            totalSum += sum;
        }

        System.out.println("결과 : " + totalSum);
    }
}