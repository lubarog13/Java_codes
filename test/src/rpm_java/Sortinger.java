package rpm_java;

import java.sql.Time;

public abstract class Sortinger<T extends Comparable> {
    public abstract void sort(T[] arr);
    public long sortWithTime(T[]arr){
        long start = System.currentTimeMillis();
        sort(arr);
        return System.currentTimeMillis()-start;
    }
}
