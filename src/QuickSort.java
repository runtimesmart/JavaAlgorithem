public class QuickSort {

    public static void quickSort_2(int[] data, int start, int end) {
        if (data == null || start >= end) return;
        int i = start, j = end;
        int pivotKey = data[start];
        while (i < j) {
            while (i < j && data[j] >= pivotKey) j--;
            if (i < j) data[i++] = data[j];
            while (i < j && data[i] <= pivotKey) i++;
            if (i < j) data[j--] = data[i];
        }
        data[i] = pivotKey;
        quickSort_2(data, start, i - 1);
        quickSort_2(data, i + 1, end);
    }

    public static void insertSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return ;

        for(int i=1; i<arr.length; i++) { //假设第一个数位置时正确的；要往后移，必须要假设第一个。

            int j = i;
            int target = arr[i]; //待插入的

            //后移
            while(j > 0 && target < arr[j-1]) {
                arr[j] = arr[j-1];
                j --;
            }

            //插入
            arr[j] = target;
        }

    }


    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
//            quickSort_2(arr, 0, arr.length-1);
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}