public class RadixSorter {

    public RadixSorter() {
    }

    public int[] sort(int[] nums){
        //caller function for using radix sort

    }

    /*Util function to get max out of an array*/
    private int getMax(int[] nums){
        int result = nums[0];
        for(Integer i : nums){
            if(i > result){
                result = i;
            }
        }
        return result;
    }

    /*Util function to count sort a small array*/
    private void countingSort(int[] nums, int n, int exponent){
        
    }


}
