/**
 * 给定一个整数数组nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class LeetCode1 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] b = twoSum(arr, 9);

        System.out.println("对应数组的索引分别是：");
        for (int x = 0; x < b.length; x++) {
            System.out.print(b[x] + " ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] a = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}
