 //        Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//
//        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//
//        You can modify the input array in-place.
 
 
 
 int[] arr={1,2,0};
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            set.add(arr[i]);

        }
        for (int i = 1; i <max ; i++) {
            if(!set.contains(i)){
                System.out.println(i);
            return;}

            }


        System.out.println(max+1);
