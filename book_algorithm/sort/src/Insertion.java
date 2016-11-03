
/**
 * Created by lzy on 2016/11/2.
 */
public class Insertion {
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && Untils.less(a[j], a[j - 1]); j--) {
                Untils.exch(a, j, j - 1);
            }

        }
    }
}
