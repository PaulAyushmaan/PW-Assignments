public class duplicates {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int n=arr.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
             if(arr[i]==arr[j]){
                System.out.println("true");
                c=1;
                break;
             }
            }
        }
        if(c==0){
            System.out.println("false");
        }
    }
}
