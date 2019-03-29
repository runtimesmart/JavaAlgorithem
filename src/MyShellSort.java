public class MyShellSort {

//希尔排序是插入排序的升级版，区别在于，希尔排序可以按步长进行比较，效率要高，是不稳定排序

    public static void shellSort(int[] arr){
        int d=arr.length/2;
        while(d>=1){
            for (int i=d;i<arr.length;i++){
                int tem=arr[i];
                int j=i-d;
                while (j>=0 && tem<arr[j]){
                    arr[j+d]=arr[j];
                    j-=d;
                }
                arr[j+d]=tem;
            }
            d/=2;
        }
    }


    public static void main(String[] a){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
