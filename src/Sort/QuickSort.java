package Sort;

public class QuickSort {
    public static int partition(int[] arr,int left,int right){
        int pivotValue = arr[left];
        while(left < right){
          while(left < right && arr[right] >= pivotValue){
            right--;
          }
          arr[left] = arr[right];
          while(left < right && arr[left] <= pivotValue){
            left++;
          }
          arr[right] = arr[left];
        }
        arr[left] = pivotValue;
        return left;
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{19,28,8,23,10,21,9};
        for(int i:arr){
            System.out.print(i+" ");
        }
        quickSort(arr,0,arr.length-1);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
