public class RadixSorter {

    //empty constructor
    public RadixSorter() {

    }

    public void sort(int[] nums){
        int n = nums.length;
        int max = nums[0];
        int exponent = 1;
        int[] temp = new int[10];
        //get max
        for(Integer i : nums){
            if(max < i){
                max = i;
            }
        }
        while(max / exponent != 0){
            int[] bucket = new int[10];
            for(int i = 0; i < n; ++ i){
                bucket[(nums[i] / exponent) % 10] ++;
            }
            for(int i = 1; i < 10; ++ i){
                bucket[i] += bucket[i - 1];
            }
            for(int i = n - 1; i >= 0; -- i){
                temp[-- bucket[(nums[i] / exponent) % 10]] = nums[i];
            }
            for(int i = 0; i < n; ++ i){
                //make result
                nums[i] = temp[i];
            }
            exponent *= 10;
        }
    }



}
