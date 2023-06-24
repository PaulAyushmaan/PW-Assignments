public class dupliocateandnextelement {
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        int n=arr.length;
        //int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                      System.out.println(arr[i]+1);
          
        
                    break;
                }
            }
        }
        //System.out.println(temp);
          //System.out.println(temp+1);
        
        
    }
}
