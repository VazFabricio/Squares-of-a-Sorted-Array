public class Main {
    public static void main(String[] args) {
    }
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] square = new int[n];
        for (int i = 0; i < n; i++) {
            square[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < n; i++) {
            int key = square[i];
            int j = i - 1;

            while (j >= 0 && square[j] > key) {
                square[j + 1] = square[j];
                j = j - 1;
            }
            square[j + 1] = key;
        }
        return square;
    }
}