
public class MyMergeSort {


    public static void sort(int[] arr,int start,int end){
        if(start<end){
            int mid=(end+start)/2;//计算start-end的中间位置，不是相差几个
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }


    //每一次merge 会保证tem数据相对有序，然后存入arr中，然后将两块相对有序合并为一块。。
    public static void merge(int[] arr,int start,int mid,int end){
        int[] tem=new int[end-start+1];
        int k=0;
        int i=start;int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                tem[k++]=arr[i++];
            }else {
                tem[k++]=arr[j++];
            }
        }

        while(i<=mid){
            tem[k++]=arr[i++];
        }
        while(j<=end){
            tem[k++]=arr[j++];
        }
        for(int m=0;m<k;m++){
            arr[m+start]=tem[m];
        }


    }

    public static void main(String[] a){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
