public class Day35 {
    public static void main(String[] args) {
        char[] arr={'G', 'B', 'R', 'R', 'B', 'R', 'G'};

        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
   public static char[] sort(char[] arr) {

        int start = 0;
        int mid = 0;
        int end= arr.length - 1;
        while (mid <= end) {
            switch (arr[mid]) {
                case 'R':
                    swap(arr,start, mid);
                    start++;
                    mid++;
                    break;
                case 'G':
                    mid++;
                    break;
                case 'B':
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }
        return arr;
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
