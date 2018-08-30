/*Bubble sort an int[]
* compare each adjacent pairs and swap if necessary until no swap is needed*/
public class bubbleSorter {
    public bubbleSorter(){
        //empty constructor
    }

    /*Bubble sort an int[]. DOESNOT MODIFY INPUT ARRAY!*/
    public int[] sort(int[] array){
        int[] a = array;
        int len = a.length;
        for(int i = 0; i < len - 1; i ++){
            for(int j = 1; j < len - i; j ++){
                if(a[j - 1] > a[j]){
                    swap(j, j - 1, a);
                }
            }
        }
        return a;
    }

    /*Bubble sort an int[] and visualize the process. MODIFIED INPUT ARRAY!*/
    public void sortAndVisualize(int[] a){
        int len = a.length;
        for(int i = 0; i < len - 1; i ++){
            for(int j = 1; j < len - i; j ++){
                if(a[j - 1] > a[j]){
                    swap(j, j - 1, a);
                    printArray(a);
                }
            }
        }
    }

    /*swap two elements in an int[]*/
    public void swap(int i, int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
