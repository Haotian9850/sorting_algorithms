/*
* Selection sort implementation of an int[]
*   search for the next smallest element in unsorted portion of input array, then swap
* */
public class SelectionSorter {
    public SelectionSorter(){
        //empty constructor
    }

    /*selection sort an int[]. DOES NOT MODIFY ORIGINAL INPUT ARRAY!*/
    public int[] sort(int[] array){
        int[] a = array;
        int len = a.length;
        int ptr;
        int temp;
        for(int i = 0; i < len - 1; i ++){
            ptr = i;
            for(int j = i + 1; j < len - 1; j ++){
                if (a[j] < a[ptr]){
                    ptr = j;
                }
            }
            //swap operation
            temp = a[i];
            a[i] = a[ptr];
            a[ptr] = temp;
        }
        return a;
    }

    /*selection sort an int[]. MODIFIES ORIGINAL INPUT ARRAY!*/
    public void sortAndVisualize(int[] a){
        int len = a.length;
        int ptr;
        int temp;
        for(int i = 0; i < len - 1; i ++){
            ptr = i;
            for(int j = i + 1; j < len - 1; j ++){
                if (a[j] < a[ptr]){
                    ptr = j;
                }
            }
            //swap operation
            temp = a[i];
            a[i] = a[ptr];
            a[ptr] = temp;
            printArray(a);
        }
    }


    /*visualization of an int[]*/
    private void printArray(int[] a){
        System.out.println();   //new line separator
        System.out.print("[");
        for(int i = 0; i < a.length - 1; i ++){
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1] + "]");
        System.out.println();   //new line separator
    }
}
