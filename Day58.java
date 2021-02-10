public class Day58 {
    public static void main(String[] args) {
        int[] arr={5,6,7,0,1,2,3,4};
        int target=5;
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        int str=left;
        int end=arr.length-1;
        if(arr[end]<target){
            str=0;
            end=left-1;
        }
        int flag=0;
        while (str<=end){
            int mid=(str+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                flag=1;
                break;
            }
            else if (target>arr[mid]){
                str=mid+1;
            }
            else {
                end=mid-1;

            }
        }
        if(flag==0){
            System.out.println(-1);
        }

    }
}
