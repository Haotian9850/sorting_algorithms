/*
* Insertion sort of an int[]
*   search for the correct place for the next array element in already sorted portion of input array*/
public class InsertionSorter {
    public InsertionSorter(){
        //empty constructor
    }

    /*insertion sort an int[]. DOES NOT MODIFY ORIGINAL INPUT ARRAY!*/
    public int[] sort(int[] array){
        int[] a = array;
        int len = a.length;
        int temp;
        int ptr;
        for(int i = 1; i < len; i ++){
            ptr = i;
            temp = a[i];
            while(ptr > 0 && temp < a[ptr - 1]){
                a[ptr] = a[ptr - 1];
                ptr --; //find correct place for temp
            }
            a[ptr] = temp;
        }
        return a;
    }

    /*insertion sort an int[] and visualize the process. DOES MODIFY ORIGINAL INPUT ARRAY!*/
    public void sortAndVisualize(int[] a){
        int len = a.length;
        int temp;
        int ptr;
        for(int i = 1; i < len; i ++){
            ptr = i;
            temp = a[i];
            while(ptr > 0 && temp < a[ptr - 1]){
                a[ptr] = a[ptr - 1];
                ptr --; //find correct place for temp
            }
            a[ptr] = temp;
            printArray(a);
        }
    }

    /*visualization of an int[]*/
    private void printArray(int[] a){
        System.out.println();   //new line separator
        System.out.print("[");
        for(int i = 0; i < a.length - 2; i ++){
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1] + "]");
        System.out.println();   //new line separator
    }
}
