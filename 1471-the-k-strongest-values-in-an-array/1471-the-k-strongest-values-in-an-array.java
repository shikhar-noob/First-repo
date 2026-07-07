class Solution {
    public int[] getStrongest(int[] arr, int k) {

        Arrays.sort(arr);

        int m = arr[(arr.length-1)/2];
        int i = 0;
        int j = arr.length - 1;
        int[] ans = new int[k];

        for (int a = 0; a < k; a++) {
            if (Math.abs(arr[i] - m) > Math.abs(arr[j] - m)) {
                ans[a] = arr[i];
                i++;
            } else {
                ans[a] = arr[j];
                j--;
            }
        }

        return ans;
    }
}
