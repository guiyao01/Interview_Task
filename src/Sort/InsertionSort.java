package Sort;
class InsertionSort{
    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1;i<len-1;i++){
            for(int j = i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        insertionSort(numbers);
        for(int n : numbers){
            System.out.print(n + " ");
        }
    }

}
