package rpm_java;

public class SelectionSorrtinger<T extends Comparable> extends Sortinger<T> {
    @Override
    public void sort(T[] arr) {
        for ( int i = 0; i < arr.length; i++ ) {
            T min = arr[i];
            int minId = i;
            for ( int j = i + 1; j < arr.length; j++ ) {
                if (arr[j].compareTo(min)<0) {
                    min = arr[j];
                    minId = j;
                }
            }
            T temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
    }
}
