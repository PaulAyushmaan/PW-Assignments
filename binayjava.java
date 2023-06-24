public class binayjava {
    public static void main(String[] args) {
        int arr[]={1,3,5,9};
        int n=arr.length;
        int target=5;
        int left=0;
       int right=n-1;
       int mid;
       while(left<=right){
        mid=(left+right)/2;
        if(arr[mid]==target){
            System.out.println(mid);
            
        }
        else if(arr[mid]<target){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
       }
        
    }
}
