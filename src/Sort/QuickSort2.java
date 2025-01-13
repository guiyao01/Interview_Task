package Sort;
class QuickSort2{

    public static int quickPath(int[] arr,int left,int right){
        int pValue = arr[left];
        while(left < right){
            while(left < right && arr[right] >= pValue){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= pValue){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pValue;
        return left;
    }
    public static void quickSort2(int[] arr,int left,int right){
        if(left < right){
            int pVal = quickPath(arr,left,right);
            quickSort2(arr,left,pVal-1);
            quickSort2(arr,pVal+1,right);
        }
    }
    public static void main(String[] args) {
      int [] arr = new int[]{19,28,8,23,10,21,9};
      for(int i:arr){
          System.out.print(i+" ");
      }
      quickSort2(arr,0,arr.length-1);
      System.out.println();
      for(int i:arr){
          System.out.print(i+" ");
      }
    }
}
