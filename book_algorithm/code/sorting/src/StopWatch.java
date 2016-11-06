/**
 * Created by lzy on 2016/11/3.
 */
public class StopWatch {
    private static long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start);
    }
}
