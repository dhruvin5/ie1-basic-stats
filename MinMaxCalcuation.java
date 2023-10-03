public class MinMaxCalculation {
    
    public int findMin(int[] numbers) {
        if (numbers.length == 0) { return 0; }
        int min = numbers[0];
        for (int num: numbers) {
            min = Math.min(min, num);
        }
        return min;
    }

    public int findMax(int[] numbers) {
        if (numbers.length == 0) { return 0; }
        int max = numbers[0];
        for (int num: numbers) {
            max = Math.max(max, num);
        }
        return max;
    }
}