package Sort;

import java.io.FileNotFoundException;

public class Seletcion {
    public static <T> void Selection (Comparable<T>[] a) {
        //选择排序算法实现代码
        int N=a.length;
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                if(less(a[j],a[i])){
                   int min=j;
                    exch(a,i,min);
                }
            }
        }
    }

    private static <T> boolean less (Comparable<T> v, Comparable<T> w) {
        return v.compareTo((T) w) < 0;
    }

    private static <T> void exch (Comparable<T>[] a, int i, int j) {
        Comparable<T> t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static <T> void show (Comparable<T>[] a) {
        //在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
            System.out.println();
        }
    }

    public static <T> boolean isSorted (Comparable<T>[] a) {
        //测试数组元素是否有序
        for (int i = 0; i < a.length; i++) {
            if(less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Selection(a);
        assert isSorted(a);
        show(a);

    }
}