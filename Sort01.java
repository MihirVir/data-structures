import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        System.out.println("Array before sorting");
        int[] arr = { 0, 1, 0, 0, 1, 1, 1, 0, 0};
        printArr(arr);
        int[] res = whileSortArr(arr);
        System.out.println("Array after sorting");
        printArr(res);
    }
    public static int[] whileSortArr(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
       // [0, 1, 0, 1] 
       // left      right
        while (left <= right) {
            while (arr[left] == 1 && left <= right) {
                left++;
            }
            while(arr[right] == 0 && left <= right) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static int[] sortArr(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, 0);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        for (int i = 0; i <= count; i++) {
            result[i] = 1;
        }

        return result;
    }
    
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
} 