public class increment {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum*10+arr[i];
        }
        sum=sum+1;
        int temp=sum;
        for(int j=n-1;j>=0;j--){
         int  r=temp%10;
         temp=temp/10;
         arr[j]=r;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]);
        }

    }
}
