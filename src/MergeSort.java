public class MergeSort{
    public static void divide(int[] arr, int s, int e){
        if(s>=e) {
            return;
        }
        int mid=(s+e)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    public static void merge(int arr[], int s, int mid, int e){
        int index_1=s;
        int index_2=mid+1;
        int index_3=0;
        int[] temp=new int[e-s+1];
        while(index_1<=mid && index_2<=e)
        {
            if(arr[index_1]<=arr[index_2])
            {
                temp[index_3]=arr[index_1];
                index_3++;
                index_1++;
            }
            else
            {
                temp[index_3]=arr[index_2];
                index_3++;
                index_2++;
            }
        }
        while(index_1<=mid){
            temp[index_3]=arr[index_1];
            index_3++;
            index_1++;
        }
        while(index_2<=e){
            temp[index_3]=arr[index_2];
            index_3++;
            index_2++;

        }
        for(int i=0;i<temp.length;i++){
            arr[s+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[]arr={9,1,8,5,3,4,6};
        int size=arr.length;
        divide(arr,0,size-1);

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }}