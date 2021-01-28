public class Day30 {
    public static void main(String[] args) {
        int[] arr={3, 0, 1, 3, 0, 5};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int max_for_left=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max_for_left){
                arr1[i]=arr[i];
                max_for_left=arr[i];
            }
            else{
                arr1[i]=max_for_left;

            }
        }
        int max_for_right=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max_for_right){
                arr2[i]=arr[i];
                max_for_right=arr[i];
            }
            else{
                arr2[i]=max_for_right;

            }


        }
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=Math.min(arr1[i],arr2[i])-arr[i];
            sum=sum+arr[i];
        }
        return sum;


    }
}
