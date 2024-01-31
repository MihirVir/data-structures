import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Helo");
        int arr[] = { 1, 8, 12, 100 };
        int target = 9;
        int result[] = twoSum(arr, target);
        System.out.println("running result");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int targetAmt = target - nums[i];

            if (map.containsKey(targetAmt)) {
                return new int[] { map.get(targetAmt), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}