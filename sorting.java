import java.util.*;

class sorting{
    /*
    public static void sort(int arr[]){
        int n = arr.length;
        int marker;
        int temp;
        for(int i=1;i<n;i++){
            marker = (i);
            while((marker>=1)){
                if(arr[marker-1]>arr[marker]){
                    temp = arr[marker];
                    arr[marker] = arr[marker-1];
                    arr[marker-1] = temp;
                }
                marker--;
            }
        }
    } 
    */

    public static void insertionSort(int arr[]){
        int n = arr.length;
        int marker;
        int temp;
        for(int i=1;i<n;i++){
            marker = (i);
            while((marker>=1)){
                if(arr[marker-1]>arr[marker]){
                    temp = arr[marker];
                    arr[marker] = arr[marker-1];
                    arr[marker-1] = temp;
                }
                marker--;
            }
        }
    } 

    protected static long timedInsertionSort(int arr[]){
        long startTime = System.currentTimeMillis();
        insertionSort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    protected static void printOut(int arr[]){
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int len = 100000;
        int[] array = new int[len];
        Random rand = new Random();
        long totalTime = 0;
        long timeToSort = 0;

        for(int j=0;j<10;j++){
            for(int i=0;i<len;i++){
                array[i] = rand.nextInt(1000);
            }
            timeToSort = timedInsertionSort(array);
            for(int i=1;i<len;i++){
                if(array[i-1]>array[i]){
                    System.out.println("FAILED TO SORT");
                    break;
                }
            }
            totalTime = totalTime + timeToSort;
            System.out.println("running time: " + timeToSort);
        }
        System.out.println("average time to sort: " + (totalTime/20));
        /*
        boolean isSorted = true;
        for(int i=1;i<len;i++){
            if(array[i-1]>array[i]){
                isSorted = false;
                break;
            }
        }
        */
    }
}