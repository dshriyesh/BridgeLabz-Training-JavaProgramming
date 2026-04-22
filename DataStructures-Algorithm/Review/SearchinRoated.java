

public class SearchinRoated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2}; 
        int k = 0;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==k){
                 System.out.println(m);
                return;
            }
            if(arr[m]>=arr[s]){
                if(arr[s]<=k && k<=arr[m]){
                    e=m-1;
                }
                else
                s=m+1;
            }
            else{
                if(arr[m]<=k && k<=arr[e]){
                    s=m+1;
                }
                else
                e=m-1;
            } 
        }
        System.out.println(-1);
    }
}
