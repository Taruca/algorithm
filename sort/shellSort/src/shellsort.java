import java.util.*;
import java.io.*;

/**
 * Created by lzy on 2016/10/9.
 */
public class shellsort {
    private static int[] Data = new int[20];

    public static void main(String args[]) {
        int i;
        int Index = 0;
        System.out.println("Please input the values you want to sort(Exit for 0):");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        StringTokenizer st;

        do {
            System.out.print("Data " + Index + ":");
            try {
                String myLine = br.readLine();
                st = new StringTokenizer(myLine);
                Data[Index] = Integer.parseInt((st.nextToken()));
            } catch (IOException ioe) {
                System.out.print("IO error:" + ioe);
            }
            Index ++;
        } while (Data[Index - 1] != 0);

        //sort data
        System.out.println("Before Shell Sorting:");
        for (i = 0; i < Index - 1; i++)
            System.out.println(" " + Data[i] + " ");
        System.out.println("");
        ShellSort(Index - 1);
        System.out.println("After Shell Sorting:");
        for (i = 0; i < Index - 1; i++)
            System.out.println(" " + Data[i] + " ");
        System.out.println("");
    }

    private static  void  ShellSort(int Index) {
        int j, k; //for loop
        int temp; // for store;
        boolean change; //the flag of data is change or not
        int dataLength;
        int pointer;

        dataLength = (int) Index/2;
        while (dataLength != 0) {
            for(j = dataLength; j < Index; j++) {
                change = false;
                temp = Data[j];
                pointer = j - dataLength;
                while (temp < Data[pointer] && pointer >= 0 && pointer <= Index) {
                    Data[pointer + dataLength] = Data[pointer];
                    pointer = pointer - dataLength;
                    change = true;
                    if (pointer < 0 || pointer > Index)
                        break;
                }
                Data[pointer + dataLength] = temp;
                if (change) {
                    System.out.print("Current sorting result:" + "\n");
                    for (k = 0; k < Index; k++)
                        System.out.println(" " + Data[k] + " ");
                    System.out.println("");
                }
            }
            dataLength = dataLength / 2;
        }
    }
}
