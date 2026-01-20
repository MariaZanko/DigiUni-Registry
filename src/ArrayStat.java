public class ArrayStat {

    public static int findMin(int[] array) {
        validateArray(array);
        int min = array[0];
        for (int value : array) {
            if (value < min) min = value;
        }
        return min;
    }

    public static int findMax(int[] array) {
        validateArray(array);
        int max = array[0];
        for (int value : array) {
            if (value > max) max = value;
        }
        return max;
    }

    public static double calculateAvg(int[] array) {
        validateArray(array);
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    private static void validateArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім");
        }
    }

    public static void main(String[] args) {

        int[] data = {10, 2, 5, 8, 20, -3};

        int[] emptyData = {};

        System.out.println(" Перевірка звичайного масиву");
        printResults(data);

        System.out.println("Перевірка порожнього масиву");
        printResults(emptyData);
    }

    public static void printResults(int[] arr) {
        try {
            System.out.println("Мінімум: " + findMin(arr));
            System.out.println("Максимум: " + findMax(arr));
            System.out.println("Середнє: " + calculateAvg(arr));
        } catch (IllegalArgumentException e) {
            System.out.println("Результат: " + e.getMessage());
        }
    }
}