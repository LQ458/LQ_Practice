public class QuickSort {
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] qs(int[] arr, int low, int high){
        if(low < high){
            int q = Partition(arr, low, high);
            qs(arr, low, q-1);
            qs(arr, q+1, high);
        }
        return arr;
    }

    private static int Partition(int[] arr, int low, int high){
        int pivot = low + (int) (Math.random() * (high - low + 1));
        swap(arr, pivot, high);
        int i = low;
        for(int j = low; j < high; j++){
            if(arr[j] < arr[high]){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 2, 1, 4};
        arr = QuickSort.qs(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}