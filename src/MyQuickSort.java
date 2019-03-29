public class MyQuickSort {

    public static void quickSort(int[] arr,int begin,int end){
        if(null==arr || begin>=end)return;
        int i=begin;
        int j=end;
        int tem=arr[i];
        while (i<j){
            while (i<j && tem<=arr[j]){
                j--;
            }
            arr[i]=arr[j];
            while (i<j && tem>=arr[i]){
                i++;
            }
            arr[j]=arr[i];
        }
        arr[j]=tem;
        quickSort(arr,begin,i-1);
        quickSort(arr,i+1,end);
    }

    public static void main(String[] a){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
            quickSort(arr, 0, arr.length-1);
//        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
