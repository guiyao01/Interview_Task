package Sort;
class SelectionSort{
    public static void selectionSort(int[] arr){
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            int minIndex = i;

            for(int j = i+1;j<len;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        selectionSort(numbers);
        for(int i:numbers){
          System.out.print(i + " ");
        }
    }

}
