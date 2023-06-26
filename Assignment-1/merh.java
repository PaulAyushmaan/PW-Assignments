public class merh {
    public static void main(String[] args) {
        int arr1[]={1,2,3,7};
        int arr2[]={2,4,5};
        int n=arr1.length;
        int m=arr2.length;
        int arr3[]=new int [n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        if(i==n){
            while(j<m){
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        if(j==m){
            while(i<n){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
        }
        for(int l=0;l<n+m;l++){
            System.out.println(arr3[l]);
        }
        
    }
}
