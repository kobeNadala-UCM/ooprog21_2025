class AverageChecker {
    public static void main(String[] args) {
        final int[] responseTime = {100, 200, 150, 300};
        int result = calculateElement(responseTime);
        System.out.println(result);
    }

    public static int calculateElement(int[] responseTime) {
        int count = 0;

        for (int i = 1; i < responseTime.length; i++) {
            int sum = 0;

            for (int j = 0; j < i; j++) {
                sum += responseTime[j];
            }

            double average = (double) sum / i;

            if (responseTime[i] > average) {
                count++;
            }
        }

        return count;
    }
}
