public class MySelectSort {

    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){ //找出最小值的下标
                    index=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[index];
            arr[index]=tem;
        }
    }

    public static void main(String[] a){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
