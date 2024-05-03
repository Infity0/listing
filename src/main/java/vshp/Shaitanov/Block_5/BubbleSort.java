package vshp.Shaitanov.Block_5;

public class BubbleSort {
    static void sort(int nums[]) {
        int t;

        for (int a = 1; a < nums.length; a++) {
            for (int b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
    }
}

