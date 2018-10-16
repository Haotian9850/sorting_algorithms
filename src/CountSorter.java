public class CountSorter {
    public CountSorter() {
    }

    public void sort(int[] nums){
        //one extra check of range
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i : nums){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        int range = max - min + 1;
        int[] counts = new int[range];
        for(int i = 0; i < nums.length; ++ i){
            ++ counts[nums[i] - min];
        }
        //prefix sum
        for(int i = 1; i < counts.length; ++ i){
            counts[i] += counts[i - 1];
        }
        //modify origin array
        int cnt = 0;
        for(int i = 0; i < counts.length; ++ i){
            while(cnt < counts[i]){
                nums[cnt] = counts[i] + min;
                ++cnt;
            }
        }
    }
}
