public class Utilerias{

   public  static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}