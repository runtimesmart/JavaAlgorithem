public class MyInsertSort {

    public static void insertSort(int[] arr){

      for(int i=1;i<arr.length;i++){
          int tem=arr[i];
          int j=i;
          while (j>0 && tem<arr[j-1]){
              arr[j]=arr[j-1]; //前边的数据比较大则向后移动
              j--;//再拿待插入的数据 比较前面的前面的数据，依次循环
          }
          //循环外，j的位置的数值<=tem，则插入
          arr[j]=tem;//至此j的每一轮循环都保证前面数据 部分有序
      }
    }

    public static void main(String[] ar){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
