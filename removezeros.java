public class removezeros {
    public static void main(String[] args) {
        int arr[]={0,1,3,0,12,0,14,15,0,18};
        int n=arr.length;
        int temp,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int j=0;j<count;j++){
        for(int i=0;i<n-1;i++){
            if(arr[i]==0 && arr[i+1]!=0){
                
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
    }
    
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    }
}
