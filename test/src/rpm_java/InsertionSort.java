package rpm_java;

public class InsertionSort<T extends Comparable> extends Sortinger<T>{

    @Override
    public void sort(T[] arr) {
            for (int i = 1; i < arr.length; i++) {
                T current = arr[i];
                int j = i - 1;
                while(j >= 0 && current.compareTo(arr[j])<0) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
    }
}
