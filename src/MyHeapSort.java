public class MyHeapSort {

    public static void buildHeap(int[] arr,int i,int length){
        int tem=arr[i];
        for(int j=2*i+1;j<length;j=j*2+1){//持续下沉，交换每个 子节点大于父节点 的节点

            if(j+1<length && arr[j]<arr[j+1]){ //找出当前节点下 子节点中较大值，
                j++;
            }
            if(tem<arr[j]){
                arr[i]=arr[j];
                i=j; //记录下子节点的位置
            }
        }
        arr[i]=tem; //将每一轮的较小值 下沉到j的位置

    }

    public static void heapSort(int[] arr){

        //将数组构建成大顶堆，从最有一个非叶子节点开始，因为叶子节点不需要比较子节点
        for(int i=arr.length/2-1;i>=0;i--){ //上升
            buildHeap(arr,i,arr.length);
        }

        //交换根节点和最后一个右叶子节点
        for(int a=arr.length-1;a>=0;a--){
            int tem=arr[0];
            arr[0]=arr[a];
            arr[a]=tem;

            //交换后，大顶堆失效，重新构建
            buildHeap(arr,0,a);
        }
    }


    public static void main(String[] a){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
