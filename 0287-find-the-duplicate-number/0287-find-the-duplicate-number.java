class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] != i + 1) {
                int correct = arr[i];
                int temp = arr[correct - 1];
                if (correct != temp) {
                    arr[correct - 1] = correct;
                    arr[i] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1; // unreachable given problem constraints
    }
}