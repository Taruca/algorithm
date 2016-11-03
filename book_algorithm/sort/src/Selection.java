
/**
 * Created by lzy on 2016/11/1.
 */
public class Selection {
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (Untils.less(a[j], a[min])) min = j;
            }
            Untils.exch(a, i, min);
            assert Untils.isSorted(a, 0, i);
        }
        assert Untils.isSorted(a);
    }
}
