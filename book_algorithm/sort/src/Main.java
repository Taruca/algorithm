import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by lzy on 2016/11/2.
 */
public class Main {
    private static String filePath = "D:/My Documents/code/java/algorithm/book_algorithm/data/";
    private static String tiny = filePath + "tiny.txt";
    private static String words = filePath + "1000words.txt";

    private static Selection selector = new Selection();
    private static Insertion insertor = new Insertion();
    private static Shell shell = new Shell();

    public static void main(String args[]) {
        try {
            //管道输入
            FileInputStream input = new FileInputStream(words);
            System.setIn(input);

            //读入、排序、显示
            String[] a = StdIn.readAllStrings();
            StopWatch timer = new StopWatch(); //计时
            insertor.sort(a);
            double time = timer.elapsedTime();
            Untils.show(a);
            System.out.println("Runing time: " + time + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
