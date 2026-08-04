class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    static void merge(int[] arr,int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        int[] l1=new int[n1];
        int[] r=new int[n2];

        for(int i=0;i<n1;i++){
            l1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=arr[j+1+m];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(l1[i]<r[j]){
                arr[k]=l1[i];
                i++;
            }
            else{
                arr[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=l1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=r[j];
            j++;
            k++;
        }
    }
    static void mergesort(int[] arr,int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,h);

            merge(arr,l,mid,h);
        }
    }
}