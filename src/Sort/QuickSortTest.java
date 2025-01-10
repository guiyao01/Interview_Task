package Sort;

public class QuickSortTest {
    public static int partition(int[] arr, int left, int right) {
        int pValue = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pValue) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pValue) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pValue;
        return left;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{19, 28, 8, 23, 10, 21, 9};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
