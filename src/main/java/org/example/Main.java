package org.example;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{0, 1, 0, 3, 40, 5, 6};
        int res = countEvens(myArray);
        System.out.println(res);
        res = differenceMaxMin(myArray);
        System.out.println(res);
        System.out.println(hasZeroSides(myArray));
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int differenceMaxMin(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max - min;
    }

    public static boolean hasZeroSides(int[] nums) {

        for (int i = 0; i < nums.length - 1; ++i) {
            if ((i == 0 || i == nums.length - 2) && nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}